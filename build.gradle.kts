import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.compose") version "1.0.0"
    id("org.sonarqube") version "3.3"
    antlr
    jacoco
}

group = "com.renegademaster"
version = "2.0.0"

repositories {
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.3")
    implementation("io.github.microutils:kotlin-logging:2.1.21")
    implementation("org.antlr:antlr4-runtime:4.10.1")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.0")
    implementation("org.slf4j:slf4j-simple:1.7.36")
    implementation(compose.desktop.currentOs)

    // Antlr
    antlr("org.antlr:antlr4:4.10.1")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(":jacocoTestReport")
}

tasks.sonarqube {
    dependsOn(":test")
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
            packageVersion = "2.0.0"
        }
    }
}

sonarqube.properties {
    property("sonar.jacoco.reportsDirectory", "build/reports/jacoco")
}
