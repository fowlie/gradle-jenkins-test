[![Build Status](https://travis-ci.org/fowlie/gradle-jenkins-test.svg?branch=master)](https://travis-ci.org/fowlie/gradle-jenkins-test)
[![Maintainer Status](http://stillmaintained.com/fowlie/gradle-jenkins-test.png)](http://stillmaintained.com/fowlie/gradle-jenkins-test)
[![Release](http://img.shields.io/badge/release-0.1-47b31f.svg)](https://github.com/fowlie/gradle-jenkins-test/releases)
[![License](http://img.shields.io/badge/license-MIT-47b31f.svg)](#copyright-and-license)

gradle-jenkins-test
============
A Gradle plugin for Jenkins users. When Gradle skips the test task because it's already up-to-date, Jenkins thinks the tests didn't run because of the old timestamp and will mark the build as failed! This plugin automatically updates the timestamp on the test report files every build, so your builds will pass.

#### Usage
  ```groovy
  buildscript {
    repositories {
      jcenter()
    }
    dependencies {
      classpath 'com.github.fowlie:gradle-jenkins-test:+'
    }
  }
  
  apply plugin: com.github.fowlie.GradleJenkinsTestPlugin
  ```
#### Why create a plugin for this?
First of all, I've always wanted to share something on GitHub. It's also my first Gradle plugin, so it has given me a good practise! It's an extremely small plugin, but it does something I guess many people need. And if you're going to write your own Gradle plugin, fork this project and think of it as a template!
