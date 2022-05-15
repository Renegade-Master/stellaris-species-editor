import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.DslContext
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.githubIssues
import jetbrains.buildServer.configs.kotlin.v2019_2.project
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.version

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2021.2"

project {

    buildType(Build)

    features {
        githubIssues {
            id = "PROJECT_EXT_4"
            displayName = "Renegade-Master/stellaris-species-editor"
            repositoryURL = "https://github.com/Renegade-Master/stellaris-species-editor"
        }
    }
}

object Build : BuildType({
    name = "Build and Test"
    buildNumberPattern = "%build.counter% - [%vcsroot.username%] - %build.vcs.number%"


    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        gradle {
            name = "Gradle Clean"
            tasks = "clean"
        }

        gradle {
            name = "Gradle Build"
            tasks = "assemble"
        }

        gradle {
            name = "Gradle Test"
            tasks = "test"
        }
    }

    triggers {
        vcs {
        }
    }

    features {
        swabra {
            verbose = true
        }
        perfmon {
        }
    }
})
