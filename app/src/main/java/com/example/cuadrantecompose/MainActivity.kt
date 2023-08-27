package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cuadrante_Compose()
               }

            }
        }
    }
}
@Composable
fun Cuadrante_Compose(){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier
            .weight(1f)
        )
        {
            Greeting(
                title = stringResource(R.string.title1),
                subtitle = stringResource(R.string.subtitle1),
                Modifier
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
            )
            Greeting(
                title = stringResource(R.string.title2),
                subtitle = stringResource(R.string.subtitle2),
                Modifier
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
            )
        }
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Greeting(title= stringResource(R.string.title3),
                subtitle= stringResource(R.string.subtitle3),
                Modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8)))
            Greeting(title= stringResource(R.string.title4),
                subtitle= stringResource(R.string.subtitle4),
                Modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF)))
        }
    }
}

@Composable
fun Greeting(title: String,subtitle: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier
            .fillMaxSize()
            .padding(16.dp)){
        Text(
            text = title,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,

        )
        Text(
            text = subtitle,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        Cuadrante_Compose()
    }
}


