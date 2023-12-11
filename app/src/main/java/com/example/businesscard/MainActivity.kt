package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(colorResource(id = R.color.background))
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 200.dp, top = 200.dp)) {
            Box(
                Modifier
                    .padding(start = Dp(120F), end = Dp(120F))
                    .background(Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Image(painter = image, contentDescription = null)
            }
            Box(Modifier.padding(16.dp)) {
                Text(
                    text = stringResource(R.string.full_name),
                    modifier = Modifier,
                    textAlign = TextAlign.Center,
                    fontSize = 36.sp,
                    color = Color.Black
                )
            }
            Box {
                Text(text = stringResource(R.string.title),
                    modifier = Modifier,
                    color = colorResource(id = R.color.title_color)
                )
            }
        }

        Row {

            Column() {
                Icon(Icons.Rounded.Call, contentDescription = "phone nubmer", tint = colorResource(id = R.color.title_color))
                Icon(Icons.Rounded.Share, contentDescription = "social media", tint = colorResource(id = R.color.title_color))
                Icon(Icons.Rounded.Email, contentDescription = "Email", tint = colorResource(id = R.color.title_color))
            }

            Column() {
                Text(text = stringResource(R.string.mobile_number), color = Color.Black)
                Text(text = stringResource(R.string.socialmedia), color = Color.Black)
                Text(text = stringResource(R.string.email), color = Color.Black)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}