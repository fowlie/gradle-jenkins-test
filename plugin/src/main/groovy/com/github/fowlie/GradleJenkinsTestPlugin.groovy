package com.github.fowlie

import org.gradle.api.Plugin
import org.gradle.api.Project

class GradleJenkinsTestPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.apply(plugin: 'java')
        project.task('jenkinsTest', type: GradleJenkinsTestTask) {
            doLast {
                description 'Updates the test report timestamps, so Jenkins doesn\'t mark the job as failed.'
            }
        }
        project.test.dependsOn project.jenkinsTest
    }
}
