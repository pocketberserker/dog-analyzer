import sbt._, Keys._

object Dependencies {

  object Version {
    val dog = "0.1.5"
  }

  val dogCore = "com.github.pocketberserker" %% "dog-core" % Version.dog
}
