resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")

addCompilerPlugin("io.tryp" % "splain" % "0.4.1" cross CrossVersion.patch)
