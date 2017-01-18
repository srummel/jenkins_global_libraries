package org.foo

class Utilities {
  static def mvn(script, args) {
  println("IN UTILITIES")
//    script.sh "${script.tool 'Maven'}/bin/mvn -s ${script.env.HOME}/jenkins.xml -o ${args}"
  }
}