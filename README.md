# Example Scala macro

`sbt test` to see it in action.

Exercise: implement the `translate` function.

## Useful links

* [Macros overview](http://docs.scala-lang.org/overviews/macros/overview)
* [Quasiquotes syntax summary](http://docs.scala-lang.org/overviews/quasiquotes/syntax-summary)
* [inline/meta pre-SIP doc](https://gist.github.com/xeno-by/9d7a709b1ba7c2ee64cfedcc5d264bd5)
* [Macros for the rest of us (video)](https://www.youtube.com/watch?v=ZVYdiAudr-I)

## Examples of real macros

* [play-json macros](https://github.com/playframework/playframework/blob/ed819049709b1c4622f1585a3c2731a94346d25a/framework/src/play-json/src/main/scala/play/api/libs/json/JsMacroImpl.scala)
* [Monocle mkLens macro](https://github.com/julien-truffaut/Monocle/blob/master/macro/shared/src/main/scala/monocle/macros/internal/Macro.scala)
* [ScalaCache's memoize macro](https://github.com/cb372/scalacache/blob/master/core/src/main/scala/scalacache/memoization/Macros.scala)
* [Circe Scrooge macros in content-api-models](https://github.com/guardian/content-api-models/blob/master/macros/src/main/scala/com/gu/contentapi/circe/CirceScroogeMacros.scala)
* [One of shapeless's macros (here be dragons!)](https://github.com/milessabin/shapeless/blob/7b90b2e4b536cbdbb0221f44c8acfa4b4089d5bf/core/src/main/scala/shapeless/generic.scala#L286)
