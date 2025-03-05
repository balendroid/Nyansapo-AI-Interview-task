plugins {
      alias(libs.plugins.android.application)
      alias(libs.plugins.kotlin.android)
      alias(libs.plugins.apollo)
      id("com.google.devtools.ksp")
      id ("androidx.navigation.safeargs.kotlin")
      id("androidx.room")
}

android {
      namespace = "com.plus.nyyansapo_ai"
      compileSdk = 34

      defaultConfig {
            applicationId = "com.plus.nyyansapo_ai"
            minSdk = 24
            targetSdk = 34
            versionCode = 1
            versionName = "1.0"

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
      }

      buildTypes {
            release {
                  isMinifyEnabled = false
                  proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro"
                  )
            }
      }
      compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
      }
      kotlinOptions {
            jvmTarget = "11"
      }
      room {
            schemaDirectory("$projectDir/schemas")
      }
}

dependencies {
      implementation(libs.apollo.runtime)

      //Offline first implementation
      implementation("androidx.room:room-ktx:2.6.1")
      ksp("androidx.room:room-compiler:2.6.1")
      // Main safety
      implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
      implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
      //Cache access tokens
      implementation ("androidx.datastore:datastore-preferences:1.0.0")
      implementation(libs.androidx.core.ktx)
      implementation(libs.androidx.appcompat)
      implementation(libs.material)
      implementation(libs.androidx.activity)
      implementation(libs.androidx.constraintlayout)
      testImplementation(libs.junit)
      androidTestImplementation(libs.androidx.junit)
      androidTestImplementation(libs.androidx.espresso.core)
}
apollo {
      service("service") {
            packageName.set("com.plus.nyyansapo_ai")
      }
}