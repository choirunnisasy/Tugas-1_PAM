package org.example.myfirstkmpapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    // Warna pink kustom
    val hotPink = Color(0xFFFF69B4)
    val lightPink = Color(0xFFFFF5F7)

    val pinkColorScheme = lightColorScheme(
        primary = hotPink,
        onPrimary = Color.White,
        surface = lightPink,
        onSurface = Color.Black
    )

    MaterialTheme(colorScheme = pinkColorScheme) {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.surface) {
            var isVisible by remember { mutableStateOf(false) }

            val platformName = remember { getPlatform().name }

            // Mengubah nama platform
            val platformInfo = if (platformName.contains("Java", ignoreCase = true)) {
                "Desktop 💻"
            } else {
                "Andro 📱"
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Halo, Choirunnisa Syawaldina!",
                    style = MaterialTheme.typography.headlineSmall,
                    color = hotPink
                )

                Text(
                    text = "NIM: 123140136",
                    modifier = Modifier.padding(top = 8.dp),
                    style = MaterialTheme.typography.bodyLarge
                )

                Text(
                    text = "Running on: $platformInfo",
                    modifier = Modifier.padding(top = 8.dp, bottom = 24.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )

                Button(
                    onClick = { isVisible = !isVisible },
                    colors = ButtonDefaults.buttonColors(containerColor = hotPink)
                ) {
                    Text(if (isVisible) "Sembunyikan" else "Klik!")
                }

                AnimatedVisibility(isVisible) {
                    Text(
                        text = "Tugas Praktikum 1 Berhasil! 🎉",
                        modifier = Modifier.padding(top = 16.dp),
                        color = hotPink,
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
        }
    }
}