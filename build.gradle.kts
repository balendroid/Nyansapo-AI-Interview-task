// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
      dependencies {
            classpath ("androidx.navigation.safeargs:androidx.navigation.safeargs.gradle.plugin:2.8.8")

      }
}

plugins {
      id ("androidx.room")version "2.6.1" apply false
      id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false
      alias(libs.plugins.android.application) apply false
      alias(libs.plugins.kotlin.android) apply false
      alias(libs.plugins.apollo) apply false
}