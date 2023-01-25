import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.io.ByteArrayOutputStream

plugins {
    kotlin("jvm") version "1.7.21"
    application
}

fun getVersionName(): Any {
    return try {
        val results = ByteArrayOutputStream()
        exec {
            commandLine = listOf("git", "describe", "--tags", "--dirty")
            standardOutput = results
        }
        results.toString().trim()
    } catch (ex: Exception) {
        ""
    }
}

group = "com.code.softech"
version = getVersionName()

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}