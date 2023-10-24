package com.example.lab10_ppm.pantallas

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.lab10_ppm.ui.theme.LAB10PPMTheme

@Composable
fun Screen(content: @Composable () -> Unit){
    LAB10PPMTheme{
        Surface( modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            content()
        }
    }
}