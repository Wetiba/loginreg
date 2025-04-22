package com.were.erickapp.ui.theme.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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

@Composable
fun Register_Screen(navController:NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var lname by remember { mutableStateOf(TextFieldValue("")) }
    var fname by remember { mutableStateOf(TextFieldValue("")) }

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFECEFF1))) {
        Text("Register Screen",
            color = Color.Black,
            fontSize = 35.sp,
            fontFamily = FontFamily.Monospace
        )
        OutlinedTextField(value = fname,
            onValueChange = {fname=it},
            label = { Text("Enter First name ",
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),

                ) }
        )
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedTextField(value = lname,
            onValueChange = {lname=it},
            label = { Text("Enter Last Name ",
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),

                ) }
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
            Text("Click to Sign Up",
                color = Color.Black,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )
        }





    }





}

@Preview
@Composable
private fun LoginPrev() {
    Register_Screen(rememberNavController())

}








