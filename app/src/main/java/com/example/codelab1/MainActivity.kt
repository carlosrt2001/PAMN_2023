package com.example.codelab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codelab1.ui.theme.CodeLab1Theme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeLab1Theme {
                // A surface container using the 'background' color author the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // GreetingText(message = "Happy Birthday Sam!", author = "author Emma")
                    GreetingImage("CodeLab1", "Carlos Rodríguez del Toro", "PAMN", "2023/2024")
                }
            }
        }
    }
}

@Composable
fun GreetingImage(title: String, author: String, course: String, year: String, modifier: Modifier = Modifier) {
    val fondo = painterResource(R.drawable.fondoazul)
    val logo = painterResource(R.drawable.ulpgc)
    //Step 3 create a box to overlap image and texts
    Box {
        Image(
            painter = fondo,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8F,
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = logo,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8F,
            modifier = Modifier
                .size(200.dp)
                .align(alignment = Alignment.Center)
        )
        GreetingText(
            title = title,
            author = author,
            course = course,
            year = year,
            modifier = Modifier
            //.fillMaxSize()
            //.padding(8.dp)
        )
    }
}

@Composable
fun GreetingText(title: String, author: String, course: String, year: String, modifier: Modifier = Modifier) {
    val Orange = Color(0xFFF9A825)
    // Create a column so that texts don't overlap
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(top = 100.dp)
    ) {
        Text(
            text = title,
            fontSize = 55.sp,
            lineHeight = 116.sp,
            color = Orange,
            modifier = Modifier.padding(horizontal = 50.dp)
        )
        Text(
            text = author,
            fontSize = 20.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(top = 510.dp)
    ) {
        Text(
            text = course,
            fontSize = 55.sp,
            lineHeight = 116.sp,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 100.dp)
        )
        Text(
            text = year,
            fontSize = 20.sp,
            color = Orange,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
    }
}


/*
@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    CodeLab1Theme {
        GreetingImage("Happy Birthday Sam!", "author Emma")
    }
}
 */