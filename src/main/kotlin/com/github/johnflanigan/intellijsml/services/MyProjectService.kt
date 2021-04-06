package com.github.johnflanigan.intellijsml.services

import com.github.johnflanigan.intellijsml.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
