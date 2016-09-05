package translation

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object Translation {

  def translateToFrench(word: String): String = macro Macros.translateToFrench_impl

  def translate(word: String, lang: String): String = ???

}

object Macros {

  private val dictionaries: Map[String, Map[String, String]] = Map(
    "french" -> Map(
      "hello" -> "bonjour",
      "goodbye" -> "au revoir"
    ), 
    "italian" -> Map(
      "hello" -> "ciao",
      "goodbye" -> "arrivederci"
    )
  )

  def translateToFrench_impl(c: Context)(word: c.Tree): c.Tree = {
    import c.universe._

    val english = word match {
      case q"${s: String}" => s
      case _ => c.abort(c.enclosingPosition, "Sorry, you can only use this macro with literal Strings")
    }

    println(s"Wow, I'm translating $english into French at compile time!!")
    dictionaries("french").get(english) match {
      case Some(french) => q"$french"
      case None => c.abort(c.enclosingPosition, s"Sorry, no entry for $english in the French dictionary")
    }
  }

}
