package com.were.erickapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.were.erickapp.ui.theme.screens.calculator.Calculator_screen
import com.were.erickapp.ui.theme.screens.dashboard.DashboardScreen
import com.were.erickapp.ui.theme.screens.home.Home_Screen
import com.were.erickapp.ui.theme.screens.intent.Intent_Screen
import com.were.erickapp.ui.theme.screens.login.Login_Screen
import com.were.erickapp.ui.theme.screens.myapp.My_app_screen
import com.were.erickapp.ui.theme.screens.myscreen.My_Screen
import com.were.erickapp.ui.theme.screens.register.Register_Screen
import com.were.erickapp.ui.theme.screens.splash.Splash_Screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_SPLASH){

    NavHost(navController=navController,
             modifier=modifier,
             startDestination = startDestination){
        composable(ROUTE_SPLASH){
            Splash_Screen(navController)

        }
        composable(ROUTE_REGISTER){
            Register_Screen(navController)
        }
        composable(ROUTE_HOME){
            Home_Screen(navController)
        }
        composable(ROUTE_LOGIN){
            Login_Screen(navController)
        }
        composable(ROUTE_MYAPP){
            My_app_screen(navController)
        }
        composable(ROUTE_CALC){
            Calculator_screen(navController)

        }
        composable(ROUTE_INTENT){
            Intent_Screen(navController)
        }
        composable(ROUTE_DASHBOARD){
            DashboardScreen(navController)
        }
        composable(ROUTE_MYSCREEN){
            My_Screen(navController)

        }



    }




}