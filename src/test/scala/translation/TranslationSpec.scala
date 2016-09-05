package translation

import org.scalatest.{Matchers, FlatSpec}

class TranslationSpec extends FlatSpec with Matchers {

  behavior of "Translation"

  it should "translate an English string into French" in {
    val translated = Translation.translateToFrench("hello")
    translated should be("bonjour")
  }

  it should "only work with literal Strings" in {
    """
    val foo = "hello"
    Translation.translateToFrench(foo)
    """ shouldNot compile
  }

  it should "fail to compile if it cannot find a translation" in {
    """Translation.translateToFrench("howdy")""" shouldNot compile
  }

  it should "translate an English string into Italian" in {
    pending
    val translated = Translation.translate("hello", "italian")
    translated should be("ciao")
  }

}
