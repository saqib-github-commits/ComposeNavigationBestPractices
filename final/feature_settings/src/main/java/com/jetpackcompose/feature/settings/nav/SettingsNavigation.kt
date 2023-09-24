package com.jetpackcompose.feature.settings.nav

import androidx.compose.material3.DrawerState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jetpackcompose.feature.settings.SettingsScreen
import com.jetpackcompose.feature.settings.SettingsViewModel

const val settingsRoute = "settings"

fun NavGraphBuilder.settingsScreen(drawerState: DrawerState) {
    composable(settingsRoute) {
        val viewModel: SettingsViewModel = hiltViewModel()
        SettingsScreen(
            drawerState = drawerState,
            viewModel = viewModel
        )

    }
}