package com.example.atividadejetpackpam

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atividadejetpackpam.ui.theme.AtividadeJetpackPamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AtividadeJetpackPamTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Atividade de PAM - JetPack")

        Image(
            painter = painterResource(R.drawable.escola),
            contentDescription = "Logo do JetPackCompose",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )

        Text(text = "Rm: 22383" )
        Text(text = "Nome: Beatriz Aparecida")
        Button(
            modifier = Modifier.fillMaxWidth(0.5f),
            onClick = { Log.d(ContentValues.TAG,"Clicou no botão debug ") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF65F36C))) {
            Text(text = "Debug")
        }
        Button(
            modifier = Modifier.fillMaxWidth(0.5f),
            onClick = { Log.i(ContentValues.TAG,"Clicou no botão info ") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF3849F3))) {
            Text(text = "Info")
        }
        Button(
            modifier = Modifier.fillMaxWidth(0.5f),
            onClick = { Log.w(ContentValues.TAG,"Clicou no botão warning ") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFAB69))) {
            Text(text = "Warning")
        }
    }

}
