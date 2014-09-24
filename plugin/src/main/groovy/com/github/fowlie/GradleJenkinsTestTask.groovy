package com.github.fowlie

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by mfa on 22.09.2014.
 */
class GradleJenkinsTestTask extends DefaultTask {
    @TaskAction
    def jenkinsTest() {
        inputs.files test.outputs.files
        doLast {
            def testResults = test.getReports().getJunitXml().getDestination()
            if (testResults.exists()) testResults.eachFile {
                it.lastModified = System.currentTimeMillis()
            }
        }
    }
}
