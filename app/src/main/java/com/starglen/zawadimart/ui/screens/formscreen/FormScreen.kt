package com.starglen.zawadimart.ui.screens.formscreen

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_DASHBOARD
import com.starglen.zawadimart.ui.theme.neworange
import java.nio.file.WatchEvent

@Composable
fun FormScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().paint(painter = painterResource(com.starglen.zawadimart.R.drawable.img_6), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {


        Image(
            painter = painterResource(com.starglen.zawadimart.R.drawable.img_4),
            contentDescription = "img",
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "Create an account",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Spacer(modifier = Modifier.height(10.dp))

        //Variables
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }

        //Fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = {fullname = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = neworange) },
            label = {Text(text = "Fullname")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = neworange,
                focusedBorderColor = Color.Red
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //End

        Spacer(modifier = Modifier.height(10.dp))

        //Username
        OutlinedTextField(
            value = username,
            onValueChange = {username = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = neworange) },
            label = {Text(text = "Username")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = neworange,
                focusedBorderColor = Color.Red
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //End

        Spacer(modifier = Modifier.height(10.dp))

        //Email address
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = neworange) },
            label = {Text(text = "Email Address")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = neworange,
                focusedBorderColor = Color.Red
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        //End

        Spacer(modifier = Modifier.height(10.dp))

        //Password
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = neworange) },
            label = {Text(text = "Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = neworange,
                focusedBorderColor = Color.Red
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        //End

        Spacer(modifier = Modifier.height(10.dp))

        //Confirm Password
        OutlinedTextField(
            value = confirmpassword,
            onValueChange = {confirmpassword = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Refresh, contentDescription = "", tint = neworange) },
            label = {Text(text = "Confirm Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = neworange,
                focusedBorderColor = Color.Red
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = PasswordVisualTransformation()

        )
        //End

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {

            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(neworange),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "Register")
        }


    }


}


@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())
}