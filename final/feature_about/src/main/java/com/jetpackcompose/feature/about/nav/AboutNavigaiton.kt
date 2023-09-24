package com.jetpackcompose.feature.about.nav

import androidx.compose.material3.DrawerState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jetpackcompose.feature.about.AboutScreen
import com.jetpackcompose.feature.about.AboutViewModel

const val aboutRoute = "about"

fun NavGraphBuilder.aboutScreen(drawerState: DrawerState) {
    composable(aboutRoute) {
        val viewModel: AboutViewModel = hiltViewModel()
        AboutScreen(
            drawerState = drawerState,
            viewModel = viewModel
        )
    }
}