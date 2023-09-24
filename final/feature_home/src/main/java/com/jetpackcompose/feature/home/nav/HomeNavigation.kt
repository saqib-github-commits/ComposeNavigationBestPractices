package com.jetpackcompose.feature.home.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jetpackcompose.feature.home.HomeScreen

const val homeRoute = "home"

fun NavGraphBuilder.homeScreen(
    onNavigateToArticle: () -> Unit
) {
    composable(homeRoute) {
        HomeScreen(
            onNavigateToArticle = onNavigateToArticle
        )
    }
}