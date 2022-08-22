buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath("dev.icerock.moko:resources-generator:0.20.1")
        //classpath("dev.icerock.moko:kswift-gradle-plugin:0.6.0")
        classpath("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.18.3")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
