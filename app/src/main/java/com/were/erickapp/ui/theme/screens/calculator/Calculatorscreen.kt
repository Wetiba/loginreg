package com.were.erickapp.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun Calculator_screen(navController:NavHostController) {

    var fnum by remember { mutableStateOf(TextFieldValue("")) }
    var snum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }
     Column(verticalArrangement = Arrangement.SpaceEvenly,
         horizontalAlignment = Alignment.CenterHorizontally,
         modifier = Modifier
             .fillMaxSize()
             .background(Color.White)) {
         Text(answer,
             color = Color.Black,
             fontSize = 35.sp,
             fontFamily = FontFamily.Monospace)
         OutlinedTextField(value = fnum,
             onValueChange = {fnum=it},
             label = { Text("Enter First number ",
                 color = Color.Black,
                 fontSize = 18.sp,
                 fontFamily = FontFamily.Monospace,
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(4.dp),

                 ) }
         )
         OutlinedTextField(value = snum,
             onValueChange = {snum=it},
             label = { Text("Enter second number ",
                 color = Color.Black,
                 fontSize = 18.sp,
                 fontFamily = FontFamily.Monospace,
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(4.dp),

                 ) }
         )
         Button(onClick = {
             val myfirstnum=fnum.text.trim()
             val mysecontnum=snum.text.trim()
             if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                 answer="Please fill in all detail"
             }else{
                 val myanswer=myfirstnum.toDouble() + mysecontnum.toDouble()
                 answer=myanswer.toString()
             }

         },
             colors = ButtonDefaults.buttonColors(Color.Magenta),
             modifier=Modifier.width(150.dp)
         ) {
             Text("+",
                 color = Color.Black,
                 fontSize = 30.sp,
                 fontFamily = FontFamily.Cursive
             )
         }
         Button(onClick = {

             val myfirstnum=fnum.text.trim()
             val mysecontnum=snum.text.trim()
             if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                 answer="Please fill in all detail"
             }else{
                 val myanswer=myfirstnum.toDouble() - mysecontnum.toDouble()
                 answer=myanswer.toString()
             }

         },
             colors = ButtonDefaults.buttonColors(Color.Magenta),
             modifier=Modifier.width(150.dp)
         ) {
             Text("-",
                 color = Color.Black,
                 fontSize = 30.sp,
                 fontFamily = FontFamily.Cursive
             )
         }
         Button(onClick = {
             val myfirstnum=fnum.text.trim()
             val mysecontnum=snum.text.trim()
             if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                 answer="Please fill in all detail"
             }else{
                 val myanswer=myfirstnum.toDouble() * mysecontnum.toDouble()
                 answer=myanswer.toString()
             }

         },
             colors = ButtonDefaults.buttonColors(Color.Magenta),
             modifier=Modifier.width(150.dp)
         ) {
             Text("*",
                 color = Color.Black,
                 fontSize = 30.sp,
                 fontFamily = FontFamily.Cursive
             )
         }
         Button(onClick = {

             val myfirstnum=fnum.text.trim()
             val mysecontnum=snum.text.trim()
             if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                 answer="Please fill in all detail"
             }else{
                 val myanswer=myfirstnum.toDouble() / mysecontnum.toDouble()
                 answer=myanswer.toString()
             }
         },
             colors = ButtonDefaults.buttonColors(Color.Magenta),
             modifier=Modifier.width(150.dp)
         ) {
             Text("/",
                 color = Color.Black,
                 fontSize = 30.sp,
                 fontFamily = FontFamily.Cursive
             )
         }



     }


}

@Preview
@Composable
private fun Calcprev() {
    Calculator_screen(rememberNavController())
}