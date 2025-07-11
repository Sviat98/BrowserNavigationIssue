package org.bashkevich.browsernavigationissue

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview

import org.bashkevich.browsernavigationissue.screens.MainScreen
import org.bashkevich.browsernavigationissue.screens.SecondScreen

@Composable
@Preview
fun App(navController: NavHostController = rememberNavController()) {
    MaterialTheme {
        NavHost(modifier = Modifier.fillMaxSize(), navController = navController, startDestination = MainScreenRoute) {
            composable<MainScreenRoute> {
                MainScreen(
                    onNavigateToSecondScreen = { navController.navigate(SecondScreenRoute) }
                )
            }
            composable<SecondScreenRoute> {

                SecondScreen(
                    onNavigateUp = { navController.navigateUp() },
                    onPopBackStack = { navController.popBackStack() }
                )
            }
        }
    }
}