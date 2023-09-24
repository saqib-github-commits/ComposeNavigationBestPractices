package com.jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jetpackcompose.feature.article.nav.articleScreen
import com.jetpackcompose.feature.article.nav.navigateToArticle
import com.jetpackcompose.feature.home.nav.homeRoute
import com.jetpackcompose.feature.home.nav.homeScreen

@Composable
fun MainNavigation(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(navController = navController, startDestination = homeRoute) {

        homeScreen {
            navController.navigateToArticle("fakeArticleId")
        }

        articleScreen {
            navController.navigateUp()
        }
    }

}