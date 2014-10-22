[![Build Status](https://travis-ci.org/fowlie/gradle-jenkins-test.svg?branch=master)](https://travis-ci.org/fowlie/gradle-jenkins-test)
[![Maintainer Status](http://stillmaintained.com/fowlie/gradle-jenkins-test.png)](http://stillmaintained.com/fowlie/gradle-jenkins-test)
[![Release](http://img.shields.io/badge/release-0.3-47b31f.svg)](https://github.com/fowlie/gradle-jenkins-test/releases)
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
#### But why write a plugin from a piece of code thats not even 10 lines of code?
* Your build script will be a little shorter and a little cleaner
* I finally have something to blog about, besides how I created the blog
