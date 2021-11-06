Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / scalaVersion     := "3.1.0"
ThisBuild / organization     := "uk.co.danielrendall"
ThisBuild / organizationName := "services-as-a-service-interfaces"

githubOwner := "danielrendall"
githubRepository := "ServicesAsAServiceInterfaces"
githubTokenSource := TokenSource.Environment("GITHUB_TOKEN")
releaseCrossBuild := true

lazy val root = (project in file("."))
  .settings(
    name := "services-as-a-service-interfaces",
    libraryDependencies ++= Seq(
      "org.nanohttpd" % "nanohttpd" % "2.3.1" % Provided
    )
  )
