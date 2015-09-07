import sbt._
import Keys._
import Common._
import Dependencies._

object build extends Build {

  private[this] val analyzerName = "dog-analyzer"

  val modules: List[String] = (
    analyzerName ::
    Nil
  )

  lazy val analyzer = Project(analyzerName, file(".")).settings(commonSettings).settings(
    libraryDependencies ++= Seq(
      dogCore
    )
  )
}
