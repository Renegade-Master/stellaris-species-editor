import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Newest Kotlin version is 1.5.10, but that version will not compile
    kotlin("jvm") version "1.4.32"

    // Newest Compose version is 0.4.0, but that version will not compile
    id("org.jetbrains.compose") version "0.3.2"
}

group = "com.renegademaster"
version = "1.0.0"

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}

dependencies {
    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
    implementation(compose.desktop.currentOs)

    // Logging libraries
    compile("ch.qos.logback:logback-classic:1.2.3")
    compile("io.github.microutils:kotlin-logging:2.0.6")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "stellaris-species-editor"
            packageVersion = "1.0.0"
        }
    }
}

allprojects {
    afterEvaluate {
        // This is required to stop builds failing due to the constantly changing nature of
        // working with Jetbrains Desktop Compose
        tasks.withType<KotlinCompile> {
            kotlinOptions {
                freeCompilerArgs = listOf(
                    "-P",
                    "plugin:androidx.compose.compiler.plugins.kotlin:suppressKotlinVersionCompatibilityCheck=true"
                )
            }
        }
    }
}
