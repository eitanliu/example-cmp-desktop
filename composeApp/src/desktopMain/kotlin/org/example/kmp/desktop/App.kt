package org.example.kmp.desktop

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import cmpdesktop.composeapp.generated.resources.Res
import cmpdesktop.composeapp.generated.resources.compose_multiplatform


@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface {

            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "home",
                enterTransition = {
                    slideInHorizontally {
                        println("enterTransition $it")
                        it
                    }
                },
                // exitTransition = { ExitTransition.None },
                // popEnterTransition = { EnterTransition.None },
                exitTransition = {
                    slideOutHorizontally {
                        println("exitTransition $it")
                        -it
                    }
                },
                popEnterTransition = {
                    slideInHorizontally {
                        println("popEnterTransition $it")
                        -it
                    }
                },
                popExitTransition = {
                    slideOutHorizontally {
                        println("popExitTransition $it")
                        it
                    }
                },
            ) {
                composable("home") {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Hello, ${getPlatform().name}")
                        Button(onClick = { navController.navigate("compose") }) {
                            Text("Go to Compose")
                        }
                    }
                }
                composable("compose") {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(onClick = { navController.popBackStack() }) {
                            Text("Go back")
                        }
                        Image(
                            painterResource(Res.drawable.compose_multiplatform),
                            contentDescription = "Compose Multiplatform"
                        )
                    }
                }
            }
        }
    }
}