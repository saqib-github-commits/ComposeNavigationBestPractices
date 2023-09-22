package com.jetpackcompose.feature.article.nav

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jetpackcompose.feature.article.ArticleScreen
import com.jetpackcompose.feature.article.ArticleViewModel

private const val articleIdArg = "articleId"

fun NavGraphBuilder.articleScreen(onNavigateBack: () -> Unit) {
    composable("article/{$articleIdArg}") {
        val viewModel: ArticleViewModel = hiltViewModel()
        ArticleScreen(
            viewModel = viewModel,
            onNavigateBack = onNavigateBack
        )
    }
}

fun NavController.navigateToArticle(articleId: String) {
    this.navigate("article/$articleId")
}

internal class ArticleArgs(articleId: String) {
    constructor(savedStateHandle: SavedStateHandle) :
            this(checkNotNull(savedStateHandle[articleIdArg]) as String)
}