package com.example.jetcpackcompose01

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetcpackcompose01.ui.theme.Jetcpackcompose01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetcpackcompose01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Text(
        text = "Hegeo $name!",
        modifier = Modifier
            .height(50.dp)
       //     .width(100.dp)
            .fillMaxWidth()
            .padding(start = 20.dp, top = 20.dp)
            .clickable { Log.d("Tag","Pulsado") }
    )
}


@Preview(
    showBackground = true,
    showSystemUi = true,
    heightDp = 50,
    //widthDp = 200,
    backgroundColor = 0x0000FF00,
    device = Devices.NEXUS_10
)
@Composable
fun GreetingPreview2() {
    Jetcpackcompose01Theme {
        Greeting("Android")
    }
}

/*
   . El formato es 0xAARRGGBB, donde:
AA: La opacidad (alpha).
RR: Rojo.
GG: Verde.
BB: Azul.
   */


/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetcpackcompose01Theme {
        Greeting("Android")
    }
}*/