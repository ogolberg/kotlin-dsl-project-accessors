plugins {
    kotlin("jvm") version "1.3.72"
    `project-accessors`
}

allprojects {
    group = "example"
    version = "1.0-SNAPSHOT"

    apply(plugin = "kotlin")
    apply(plugin = "project-names")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
    }

    tasks {
        compileKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
        compileTestKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
    }

}