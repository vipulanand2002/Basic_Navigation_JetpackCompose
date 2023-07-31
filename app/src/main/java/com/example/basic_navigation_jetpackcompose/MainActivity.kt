package com.example.basic_navigation_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mynavigation()

    }
}

@Composable
fun Mynavigation(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Dashboard.route){
        composable(Dashboard.route){
            DashBoardScreen(navController)
        }
        composable(Details.route){
            DetailScreens(navController)
        }
    }

}}