package com.vivek.jetcanvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.vivek.jetcanvas.ui.composeview.DrawFootballGround
import com.vivek.jetcanvas.ui.theme.JetCanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetCanvasTheme {
                    DrawFootballGround()
            }
        }
    }
}
