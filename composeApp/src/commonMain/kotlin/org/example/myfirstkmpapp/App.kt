package org.example.myfirstkmpapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            var isVisible by remember { mutableStateOf(false) }

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // TUGAS 3.1: Nama Lengkap
                Text(
                    text = "Halo, Choirunnisa Syawaldina!",
                    style = MaterialTheme.typography.h5
                )

                // TUGAS 3.2: NIM Anda
                Text(
                    text = "NIM: 123140136",
                    modifier = Modifier.padding(top = 8.dp)
                )

                // TUGAS 3.3: Menampilkan Platform
                Text(
                    text = "Platform: Desktop (JVM)",
                    modifier = Modifier.padding(top = 8.dp, bottom = 24.dp),
                    style = MaterialTheme.typography.body2
                )

                Button(onClick = { isVisible = !isVisible }) {
                    Text(if (isVisible) "Tutup" else "Klik Saya!")
                }

                AnimatedVisibility(isVisible) {
                    Text(
                        text = "Tugas Praktikum 1 Berhasil! 🎉",
                        modifier = Modifier.padding(top = 16.dp),
                        color = MaterialTheme.colors.primary
                    )
                }
            }
        }
    }
}