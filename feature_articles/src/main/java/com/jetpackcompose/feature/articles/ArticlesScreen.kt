package com.jetpackcompose.feature.articles

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.jetpackcompose.ui.common.CustomAppBar

@Composable
fun ArticlesScreen(drawerState: DrawerState, viewModel: ArticlesViewModel) {
    Scaffold(
        topBar = { CustomAppBar(
            drawerState = drawerState,
            title = "Articles"
        ) }
    ) { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = " Articles Screen")
        }
    }
}