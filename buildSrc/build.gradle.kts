import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.40"
}

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}