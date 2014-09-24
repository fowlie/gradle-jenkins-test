package com.github.fowlie

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GradleJenkinsTestTask extends DefaultTask {
    @TaskAction
    def jenkinsTest() {
            def testResults = project.test.getReports().getJunitXml().getDestination()
            if (testResults.exists()) testResults.eachFile {
                it.lastModified = System.currentTimeMillis()
            }
    }
}
