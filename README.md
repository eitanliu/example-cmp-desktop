This is a Kotlin Multiplatform project targeting Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

[Get started with Kotlin/Native](https://kotlinlang.org/docs/native-get-started.html)  
[Kotlin Multiplatform Wizard](https://kmp.jetbrains.com/)  
[Klibs Compose UI](https://klibs.io/?tags=Compose+UI)  
[kmp-awesome](https://github.com/terrakok/kmp-awesome)
[compose-multiplatform](https://github.com/JetBrains/compose-multiplatform)  
[kotlin-multiplatform-dev-docs/compose-navigation.md](https://github.com/JetBrains/kotlin-multiplatform-dev-docs/blob/master/topics/compose/compose-navigation.md)  

[Android BOM to library version mapping](https://developer.android.com/develop/ui/compose/bom/bom-mapping)  
[Maven Central: org.jetbrains.androidx.navigation:navigation-compose](https://central.sonatype.com/artifact/org.jetbrains.androidx.navigation/navigation-compose)  
[Maven Repository: org.jetbrains.compose » org.jetbrains.compose.gradle.plugin](https://mvnrepository.com/artifact/org.jetbrains.compose/org.jetbrains.compose.gradle.plugin)  
