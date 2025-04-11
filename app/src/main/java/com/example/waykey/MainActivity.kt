package com.example.waykey

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import android.util.Size
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.waykey.ui.theme.ArcShape
import com.example.waykey.ui.theme.WaykeyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                TopBar()
                Card()
                Card()
                Card()
                BottomBar()
            }

        }
    }
}




@Composable
private fun TopBar(){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(top = 30.dp)
    ){
        Text(text = "WayKey", modifier = Modifier, fontSize = 50.sp)
        Box(Modifier.fillMaxWidth()){
            Button(
                modifier = Modifier.align(Alignment.CenterEnd),
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                contentPadding = PaddingValues(0.dp),
            ){
                Image(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "menu",
                    Modifier.size(30.dp),
                )
            }
        }
    }
}



@Composable
private fun CardContainer(){

}

@Composable
private fun BottomBar(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .clip(ArcShape())
        .background(Color(0xFF628A9F))
        .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ){
        Button(
            onClick = {},
            shape = CircleShape,
        ){
            Icon(Icons.Default.Add, contentDescription = "Add")
        }
    }
}



@Composable
private fun Card() {
    Row(
        modifier = Modifier
            .background(
                color = Color(0xFF217b7e),
                shape = RoundedCornerShape(20.dp)
            )
            .height(80.dp)
            .width(290.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.location),
                contentDescription = "Location logo",
                Modifier.size(40.dp)
            )
        }

        Text(
            text = "Houston, Texas",
            fontSize = 20.sp,
            color = Color.White

        )

        Button(
            onClick = {},
            modifier = Modifier
                .size(40.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            shape = RoundedCornerShape(15.dp),
            contentPadding = PaddingValues(0.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.delete),
                contentDescription = "delete",
                Modifier.size(30.dp),
            )
        }
    }
}