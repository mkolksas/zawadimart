package com.starglen.zawadimart.ui.screens.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_ABOUT
import com.navigation.ROUT_HOME
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.newblue
import com.starglen.zawadimart.ui.theme.newgrey
import com.starglen.zawadimart.ui.theme.newlightblue
import com.starglen.zawadimart.ui.theme.neworange
import com.starglen.zawadimart.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssignmentScreen(navController: NavController){

    Column(Modifier
        .fillMaxSize()) {

            Text(text = "Hi Samantha"
            )

            Text(text = "Here are your projects")





        //Row
        Row (modifier = Modifier.padding(start = 20.dp, top = 50.dp)){

            //Card1
            Card(
                modifier = Modifier.width(150.dp).height(300.dp).clickable { navController.navigate(ROUT_HOME) }
            ){
                Column(
                    modifier = Modifier.fillMaxSize().background(color = newblue),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {



                }


            }
            //End of Card1

            Spacer(modifier = Modifier.width(25.dp))


            //Card2
            Card(
                modifier = Modifier.width(150.dp).height(300.dp).clickable { navController.navigate(ROUT_ABOUT) }
            ){
                Column(
                    modifier = Modifier.fillMaxSize().background(color = neworange),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {



                }


            }
            //End of Card2

            Spacer(modifier = Modifier.width(25.dp))

            //Card3
            Card(
                modifier = Modifier.width(150.dp).height(300.dp).clickable { navController.navigate(ROUT_ABOUT) }
            ){
                Column(
                    modifier = Modifier.fillMaxSize().background(color = newlightblue),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {


                }


            }
            //End of Card3

        }

        //End of Row

        Spacer(modifier = Modifier.height(25.dp))

        Box{


            //Card
            Card(
                modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
                colors = CardDefaults.cardColors(newgrey)

            ) {
                Text(
                    text = "Personal Tasks"
                )



            }
            //End of Card



            }

        }
        //End of Box

    }






@Preview(showBackground = true)
@Composable
fun AssignmentScreenPreview(){
    AssignmentScreen(rememberNavController())
}