package com.jetpackcompose.feature.articles.nav

import androidx.compose.material3.DrawerState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jetpackcompose.feature.articles.ArticlesScreen
import com.jetpackcompose.feature.articles.ArticlesViewModel

const val articlesRoute = "articles"

fun NavGraphBuilder.articlesScreen(
    drawerState: DrawerState,
    onNavigateToArticle: () -> Unit,
) {
    composable(articlesRoute) {
        val viewModel: ArticlesViewModel = hiltViewModel()
        ArticlesScreen(
            drawerState = drawerState,
            viewModel = viewModel,
            onNavigateToArticle = onNavigateToArticle
        )
    }

}