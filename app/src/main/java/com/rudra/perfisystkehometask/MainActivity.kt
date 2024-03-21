package com.rudra.perfisystkehometask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "mainPage"
            ) {
                composable("mainPage") {
                    Column() {
                        Button(
                            onClick = {
                                navController.navigate("splitify_home")
                            }
                        ) {
                            Text(
                                text = "Splitify Home"
                            )
                        }
                        Button(
                            onClick = {
                                navController.navigate("splitify_history")
                            }
                        ) {
                            Text(
                                text = "Splitify History"
                            )
                        }
                        Button(
                            onClick = {
                                navController.navigate("margh")
                            }
                        ) {
                            Text(
                                text = "Margh"
                            )
                        }
                    }
                }
                composable("splitify_home") {
                    SlpitifyHomePage()
                }
                composable("splitify_history") {
                    SlpitifyHistoryPage()
                }

                navigation(startDestination = "margh_main", route = "margh") {
                    composable("margh_main") {
                        MarghMainPage(navController)
                    }
                    composable("margh_home") {
                        MarghHomePage()
                    }
                    composable("margh_saved") {

                    }
                    composable("margh_profile") {
                        MarghProfilePage()
                    }
                }
            }
        }
    }
}