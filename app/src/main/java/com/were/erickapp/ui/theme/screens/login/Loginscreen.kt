package com.were.erickapp.ui.theme.screens.login

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.were.erickapp.navigation.ROUTE_REGISTER

@Composable
fun Login_Screen(navController:NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFECEFF1))) {
        Text("Login Screen",
            color = Color.Black,
            fontSize = 35.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(value = email,
            onValueChange = {email=it},
            label = { Text("Enter email ",
                     color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),

            ) }
            )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = { Text("Enter Password ",
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),

                ) }
        )
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier=Modifier.fillMaxWidth()
        ) {
            Text("Click to log in",
                color = Color.Black,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("Dont have an account? Click Register",
            fontSize = 20.sp,
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_REGISTER) }
        )





    }





}

@Preview
@Composable
private fun LoginPrev() {
    Login_Screen(rememberNavController())

}

