package com.github.fowlie

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by mfa on 22.09.2014.
 */
class GradleJenkinsTestPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println 'hello plugin'
        project.apply(plugin: 'java')
        project.task('jenkinsTest', type: GradleJenkinsTestTask) << {
            description 'Updates the test report timestamps, so Jenkins doesn\'t mark the job as failed.'
        }
        project.test.dependsOn project.jenkinsTest
    }
}