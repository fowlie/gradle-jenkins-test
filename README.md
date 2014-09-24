<a href="https://travis-ci.org/fowlie/gradle-jenkins-test" target="_blank"><img src="https://travis-ci.org/fowlie/gradle-jenkins-test.svg?branch=master"/></a>
jenkins-test
============
A Gradle plugin for Jenkins users. 
When Gradle skips the test task because it's already up-to-date, Jenkins thinks the tests didn't run because of the old timestamp. 
This plugin automatically updates the timestamp on the test report files.
