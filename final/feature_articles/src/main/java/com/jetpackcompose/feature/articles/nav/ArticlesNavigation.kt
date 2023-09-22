package com.jetpackcompose.feature.articles.nav

import androidx.compose.material3.DrawerState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jetpackcompose.feature.articles.ArticlesScreen
import com.jetpackcompose.feature.articles.ArticlesViewModel

private const val ARTICLES_ROUTE = "articles"

fun NavGraphBuilder.articlesScreen(
    drawerState: DrawerState,
    onNavigateToArticle: () -> Unit,
) {
    composable(ARTICLES_ROUTE) {
        val viewModel: ArticlesViewModel = hiltViewModel()
        ArticlesScreen(
            drawerState = drawerState,
            viewModel = viewModel,
            onNavigateToArticle = onNavigateToArticle
        )
    }

}