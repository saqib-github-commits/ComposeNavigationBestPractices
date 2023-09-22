package com.jetpackcompose.feature.article

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.jetpackcompose.feature.article.nav.ArticleArgs
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class ArticleViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): ViewModel() {
    val articleArgs = ArticleArgs(savedStateHandle)
}