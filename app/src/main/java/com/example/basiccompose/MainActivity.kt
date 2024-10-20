package com.example.basiccompose

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccompose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicCompose(modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.Top, modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Indonesia", modifier = modifier,
            fontSize = 30.sp, color = Color.Red, fontWeight = FontWeight.Bold,
        )
        Text(text = "Versus",
            style = TextStyle(
                fontSize = 50.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Blue
            )
        )
        Image(painter = painterResource(id = R.drawable.madrid), contentDescription = null,
            modifier = Modifier.size(width = 200.dp, height = 200.dp)
        )
        Text(text = "Nama",
            style = TextStyle(
                fontSize =  25.sp,
                fontStyle = FontStyle.Italic,
            )
        )
        Text(text = "Atama Cahya El Firdausy",
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Green,
            )
        )
        Text(text = "20220140021",
            style = TextStyle(
                fontSize = 45.sp,
                fontWeight = FontWeight.Bold,
            )
        )
        Image(
            painter = painterResource(id = R.drawable.tama),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
                .clip(RoundedCornerShape(50.dp))
        )
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicComposeTheme {
        Greeting("Android")
    }
}