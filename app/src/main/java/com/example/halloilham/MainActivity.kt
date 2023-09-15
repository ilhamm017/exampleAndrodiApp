package com.example.halloilham

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.halloilham.ui.theme.HalloIlhamTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HalloIlhamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Bayu", "Hehe")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, pesan: String, modifier: Modifier = Modifier) {
    Row { // agar tulisan bisa bersusun secara vertikal
        Image(
            painter = painterResource(R.drawable.image), // Mengambil gambar dari resource. gambar bernama image.jpg
            contentDescription = "Foto Profile", // deskripsi konten jika tidak tertampil gambar
            modifier = Modifier // mengukur ukuran gambar
                .size(80.dp)
                .clip(CircleShape)
        )

        Column {
            Text(
                text = "Hello $name!", // menampilkan Hello $name
                modifier = modifier
            )
            Text(
                text = "Ini $pesan", // menampilkan Hello $pesan .
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HalloIlhamTheme {
        Greeting("Bambang", "Hehe")
    }
}