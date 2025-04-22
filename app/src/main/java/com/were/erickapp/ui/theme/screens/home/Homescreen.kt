package com.were.erickapp.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.were.erickapp.R
import com.were.erickapp.navigation.ROUTE_LOGIN
import com.were.erickapp.navigation.ROUTE_REGISTER
import com.were.erickapp.ui.theme.Mynewcolor

@Composable
fun Home_Screen(navController:NavHostController) {

    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {


        Text("Manchester United",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text("Welcome to Manchester United",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            colors = ButtonDefaults.buttonColors(Mynewcolor),
            modifier=Modifier.width(300.dp)
            ) {
            Text("Click to log in",
                color = Color.Black,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
                )
        }
        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            colors = ButtonDefaults.buttonColors(Mynewcolor),
            modifier=Modifier.width(300.dp)
        ) {
            Text("Click to Register",
                color = Color.Black,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )
        }
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mynewcolor),
            modifier = Modifier.width(300.dp)) {
            Text("My App",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black
            )

        }
        Image(painter = painterResource(id = R.drawable.manu),
            contentDescription = "man",
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape))



    }





}

@Preview
@Composable
private fun Homeprev() {
    Home_Screen(rememberNavController())
}