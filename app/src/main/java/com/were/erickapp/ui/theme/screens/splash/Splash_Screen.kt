package com.were.erickapp.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.were.erickapp.R
import com.were.erickapp.navigation.ROUTE_HOME
import com.were.erickapp.ui.theme.Mynewcolor
import com.were.erickapp.ui.theme.green
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Splash_Screen(navController:NavHostController) {
    val coroutine= rememberCoroutineScope()
    coroutine.launch {
        delay(3000)
        navController.navigate(ROUTE_HOME)
    }



    Column(modifier=Modifier
         .fillMaxSize()
         .background(Mynewcolor),
         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally) {

         Image(painter = painterResource(id = R.drawable.splash),
             contentDescription = "splash",
             modifier = Modifier
                 .width(300.dp)
                 .height(400.dp))
         Text("Code",
             fontSize =20.sp,
             fontWeight = FontWeight.ExtraBold,
             color = green
         )


     }


}

@Preview
@Composable
private fun SpashPrev() {

    Splash_Screen(rememberNavController())

}