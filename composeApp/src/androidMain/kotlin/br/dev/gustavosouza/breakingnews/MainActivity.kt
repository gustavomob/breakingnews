package br.dev.gustavosouza.breakingnews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Composable
fun MessageCard(name: String){
    Text(text = "Hello, $name!", color = Color.White)
}

@Preview
@Composable
fun MessageCardPreview(){
    Column {
        MessageCard(name = "Gustavo")
        MessageCard(name = "Souza")
    }

}


@Preview
@Composable
fun AppAndroidPreview() {
    App()
}