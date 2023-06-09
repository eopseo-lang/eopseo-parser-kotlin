plugins {
    kotlin("multiplatform") version "1.8.20"
}

buildscript {
    repositories {
        mavenCentral()
        maven(url="https://jitpack.io")
    }
    val antlrGroup = "com.strumenta.antlr-kotlin"
    val antlrVersion = "-SNAPSHOT"
    dependencies {
        classpath("$antlrGroup:antlr-kotlin-gradle-plugin:$antlrVersion")
    }
}

val antlrGroup = "com.strumenta.antlr-kotlin"
val antlrVersion = "-SNAPSHOT"

version = "0.1-SNAPSHOT"
group = "io.github.eopseo-lang"

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://jitpack.io")
}

kotlin {
    jvm()
    js(IR) {
        browser()
        nodejs()
    }
    // region:Region: Configurations for Kotlin/Native
    linuxX64("linux") {
        binaries {
            staticLib()
        }
    }
    mingwX64("windows") {
        binaries {
            staticLib()
        }
    }
    // endregion

    sourceSets {
        val commonAntlr by creating {

            dependencies {
                api(kotlin("stdlib-common"))
                api("$antlrGroup:antlr-kotlin-runtime:$antlrVersion")
            }
        }

        val commonMain by getting {
            dependsOn(commonAntlr)
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
    }

}

tasks.register<com.strumenta.antlrkotlin.gradleplugin.AntlrKotlinTask>("generateKotlinCommonGrammarSource") {
    // the classpath used to run antlr code generation
    antlrClasspath = configurations.detachedConfiguration(
        // antlr itself
        // antlr is transitive added by antlr-kotlin-target,
        // add another dependency if you want to choose another antlr4 version (not recommended)
        // project.dependencies.create("org.antlr:antlr4:$antlrVersion"),

        // antlr target, required to create kotlin code
        project.dependencies.create("$antlrGroup:antlr-kotlin-target:$antlrVersion")
    )
    maxHeapSize = "64m"
    packageName = "eopseox.parser"
    arguments = listOf()
    source = project.objects
        .sourceDirectorySet("antlr", "antlr")
        .srcDir("${rootDir.absolutePath}/eopseo-grammar/grammar/antlr4").apply {
            include("*.g4")
        }
    outputDirectory = File("src/commonAntlr/kotlin")
}

tasks.build {
    dependsOn("generateKotlinCommonGrammarSource")
}



