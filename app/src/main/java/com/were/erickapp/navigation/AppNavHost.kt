package com.were.erickapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.were.erickapp.ui.theme.screens.home.Home_Screen
import com.were.erickapp.ui.theme.screens.login.Login_Screen
import com.were.erickapp.ui.theme.screens.myapp.My_app_screen
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


    }




}