# mobile-development
## Feature
- **Splash screen**: Here is an initial screen displaying the app's logo while it loads.
- **Onboarding**: Here is a series of introductory screens guiding you through the app's features.
- **Authentication**: Here is the process for verifying your identity via login or sign-up.
- **Pick image from gallery**: You can select an image from your device's gallery.
- **Take an image from camera**: You can capture a photo using your device's camera.
- **Car damage detection**: Here is a tool for identifying and assessing car damage from your uploaded images.
- **Nearby repair shops using Google Maps API**: You can find local repair shops on a map using Google Maps.
- **Useful tips about car damage**: Here are some tips and advice on identifying and addressing car damage.
- **Car damage detection history**: Here is a log of your previous car damage assessments conducted within the app.

## Dependencies
- **TouchImageView**
  - Gradle:
    ```kotlin
    implementation("com.github.MikeOrtiz:TouchImageView:1.4.1")
    ```
  - Dokumentasi: [TouchImageView GitHub](https://github.com/MikeOrtiz/TouchImageView)

- **SwipeRefreshLayout**
  - Gradle:
    ```kotlin
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    ```
  - Dokumentasi: [SwipeRefreshLayout Documentation](https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout)

- **DataStore Preferences**
  - Gradle:
    ```kotlin
    implementation("androidx.datastore:datastore-preferences:1.0.0")
    ```
  - Dokumentasi: [DataStore Preferences](https://developer.android.com/jetpack/androidx/releases/datastore)

- **Lifecycle ViewModel KTX**
  - Gradle:
    ```kotlin
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    ```
  - Dokumentasi: [Lifecycle ViewModel KTX](https://developer.android.com/jetpack/androidx/releases/lifecycle)

- **Lifecycle LiveData KTX**
  - Gradle:
    ```kotlin
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    ```
  - Dokumentasi: [Lifecycle LiveData KTX](https://developer.android.com/jetpack/androidx/releases/lifecycle)

- **Activity KTX**
  - Gradle:
    ```kotlin
    implementation("androidx.activity:activity-ktx:1.7.2")
    ```
  - Dokumentasi: [Activity KTX](https://developer.android.com/jetpack/androidx/releases/activity)

- **Retrofit**
  - Gradle:
    ```kotlin
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    ```
  - Dokumentasi: [Retrofit Documentation](https://square.github.io/retrofit/)

- **Retrofit Gson Converter**
  - Gradle:
    ```kotlin
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    ```
  - Dokumentasi: [Retrofit Gson Converter](https://square.github.io/retrofit/)

- **OkHttp Logging Interceptor**
  - Gradle:
    ```kotlin
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
    ```
  - Dokumentasi: [OkHttp Logging Interceptor](https://square.github.io/okhttp/)

- **Google Places SDK**
  - Gradle:
    ```kotlin
    implementation("com.google.android.libraries.places:places:3.1.0")
    ```
  - Dokumentasi: [Google Places SDK](https://developers.google.com/places/android-sdk/overview)

- **Google Maps SDK**
  - Gradle:
    ```kotlin
    implementation("com.google.android.gms:play-services-maps:18.0.0")
    ```
  - Dokumentasi: [Google Maps SDK](https://developers.google.com/maps/documentation/android-sdk/overview)

- **Google Location Services**
  - Gradle:
    ```kotlin
    implementation("com.google.android.gms:play-services-location:18.0.0")
    ```
  - Dokumentasi: [Google Location Services](https://developers.google.com/android/guides/overview)

- **ExifInterface**
  - Gradle:
    ```kotlin
    implementation("androidx.exifinterface:exifinterface:1.3.6")
    ```
  - Dokumentasi: [ExifInterface Documentation](https://developer.android.com/jetpack/androidx/releases/exifinterface)

- **CircleImageView**
  - Gradle:
    ```kotlin
    implementation("de.hdodenhof:circleimageview:3.1.0")
    ```
  - Dokumentasi: [CircleImageView GitHub](https://github.com/hdodenhof/CircleImageView)

- **Core SplashScreen**
  - Gradle:
    ```kotlin
    implementation("androidx.core:core-splashscreen:1.0.0")
    implementation("androidx.core:core-splashscreen:1.0.0-beta02")
    ```
  - Dokumentasi: [Core SplashScreen](https://developer.android.com/jetpack/androidx/releases/core)

- **Core KTX**
  - Gradle:
    ```kotlin
    implementation("androidx.core:core-ktx:1.13.1")
    ```
  - Dokumentasi: [Core KTX](https://developer.android.com/jetpack/androidx/releases/core)

- **AppCompat**
  - Gradle:
    ```kotlin
    implementation("androidx.appcompat:appcompat:1.6.1")
    ```
  - Dokumentasi: [AppCompat](https://developer.android.com/jetpack/androidx/releases/appcompat)

- **Material Components for Android**
  - Gradle:
    ```kotlin
    implementation("com.google.android.material:material:1.12.0")
    ```
  - Dokumentasi: [Material Components for Android](https://material.io/develop/android)

- **ConstraintLayout**
  - Gradle:
    ```kotlin
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    ```
  - Dokumentasi: [ConstraintLayout](https://developer.android.com/jetpack/androidx/releases/constraintlayout)

- **JUnit**
  - Gradle:
    ```kotlin
    testImplementation("junit:junit:4.13.2")
    ```
  - Dokumentasi: [JUnit 4](https://junit.org/junit4/)

- **AndroidX Test Ext JUnit**
  - Gradle:
    ```kotlin
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    ```
  - Dokumentasi: [AndroidX Test Ext JUnit](https://developer.android.com/jetpack/androidx/releases/test)

- **Espresso Core**
  - Gradle:
    ```kotlin
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    ```
  - Dokumentasi: [Espresso](https://developer.android.com/training/testing/espresso)

- **Glide**
  - Gradle:
    ```kotlin
    implementation("com.github.bumptech.glide:glide:4.12.0")
    ```
  - Dokumentasi: [Glide Documentation](https://github.com/bumptech/glide)


# Getting Started Application
- Prequisites
  - [Android Studio](https://developer.android.com/studio)
  - JRE (Java Runtime Environment) or JDK (Java Development Kit).
- Installation
  - Clone this repository and import into Android Studio
    ```python
    https://github.com/CrashSnap/mobile-development
    ```
  - Get a free API Key at [Google Maps Platform](https://developers.google.com/maps/documentation/android-sdk/get-api-key)
  - Enter your API Key ini local.properties file
    ```kotlin
    API_KEY = "YOUR_API_KEY_HERE"
    ```
## Contribution

If you want to contribute to this project, please create a pull request or open a new issue in this repository. Your contributions are greatly appreciated!

## Authors

- [Dheril Ismail Octavians](https://github.com/Snasset)
- [Ahamd Shafwan Dzaky](https://github.com/AhmadShafwanDzaky)

## License

This project is licensed under the [MIT License](LICENSE).
