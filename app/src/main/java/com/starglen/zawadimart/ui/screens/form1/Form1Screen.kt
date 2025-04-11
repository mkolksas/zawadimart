package com.starglen.zawadimart.ui.screens.form1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.starglen.zawadimart.ui.theme.newgrey

@Composable
fun Form1Screen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Logo App")

        Box{


            //Card
            Card(
                modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 400.dp),
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
                colors = CardDefaults.cardColors(newgrey),


            ) {
               Column() {
                   Text(text = "The Most Worth",
                       modifier = Modifier.padding(start = 200.dp))
                   Text(text = "Grocery App")

               }



            }
            //End of Card



        }

    }
    //End of Box



}




@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){
    Form1Screen(rememberNavController())
}