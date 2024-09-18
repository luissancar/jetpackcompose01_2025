package com.example.jetcpackcompose01

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetcpackcompose01.ui.theme.Jetcpackcompose01Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetcpackcompose01Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = { Text("Mi AppBar") }
                        )
                    },
                    bottomBar = {
                        BottomAppBar {
                            Text("Menú Inferior", Modifier.padding(16.dp))
                        }
                    },
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {// Padding dinámico que maneja Scaffold){
                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }

            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    MyRow()
    return
    MyText("Texto")
    return
    MyColunm2()
    return
    MyBox("HolaHolaHolaHola")
    return
    Text(
        text = "Hegeo $name!",
        modifier = Modifier
            .height(50.dp)
            //     .width(100.dp)
            .fillMaxWidth()
            .padding(start = 20.dp, top = 20.dp)
            .clickable { Log.d("Tag", "Pulsado") }
    )

    Text(
        text = "dfyhgdsfghfdghfg",
        modifier = Modifier
            .height(50.dp)
            //     .width(100.dp)
            .fillMaxWidth()
            .padding(start = 20.dp, top = 20.dp)
            .clickable { Log.d("Tag", "Pulsado") }
    )
}


@Composable
fun MyBox(name: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(80.dp)
                .background(Color.Blue)
        )
        //   Box(modifier = Modifier.background(Color.Green)){
        //      Text(name)
        // }
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .background(Color.Gray)
                .verticalScroll(
                    rememberScrollState()
                )
        )
        {
            Text(name)
        }


    }
}

@Composable
fun MyRow(){
    Row(Modifier.fillMaxSize().horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.SpaceBetween) {
        Text("A")
        Text("B")
        Text("C")
    }
}

@Composable
fun MyColunm1() {
    Column(Modifier.fillMaxSize()) {
        Text(
            "Una", modifier = Modifier
                .background(Color.Red)
                .weight(2f)
        )
        Text(
            "Dos", modifier = Modifier
                .background(Color.Gray)
                .weight(1f)
        )
        Text(
            "Tres", modifier = Modifier
                .background(Color.Yellow)
                .weight(1f)
        )
        Text(
            "Cuatro", modifier = Modifier
                .background(Color.Blue)
                .weight(.5f)
        )
    }
}


@Composable
fun MyColunm2() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        for (num in 1..100)
            Text(
                num.toString(), modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth()
                    .height(100.dp)
            )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    // heightDp = 50,
    //widthDp = 200,
    backgroundColor = 0x0000FF00,
    // device = Devices.NEXUS_10
)
@Composable
fun GreetingPreview2() {
    Jetcpackcompose01Theme {
        Greeting("Android")
    }
}

@Composable
fun MyText(texto: String) {
    Text(
        texto,
        color = Color.Blue,
        fontSize = 40.sp,
        fontFamily = FontFamily.Monospace,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold
    )
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