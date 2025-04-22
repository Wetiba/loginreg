package com.were.erickapp.ui.theme.screens.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.were.erickapp.R
import com.were.erickapp.ui.theme.Mynewcolor

@Composable
fun My_app_screen(navController:NavHostController) {

    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Image(painterResource(id = R.drawable.myapp),
            contentDescription = "myimage")

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mynewcolor),
            modifier = Modifier.width(300.dp)) {
            Text("Intent",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black
            )

        }
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mynewcolor),
            modifier = Modifier.width(300.dp)) {
            Text("Calculator",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black
            )

        }



    }


}

@Preview
@Composable
private fun MyappPrev() {

    My_app_screen(rememberNavController())



}
