package com.example.bookshelf.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bookshelf.ui.screens.HomeScreen
import com.example.bookshelf.utils.ThemePreviews

@Composable
fun BookshelfApp(
    modifier: Modifier = Modifier
) {
    Scaffold(modifier = modifier.fillMaxSize()) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            val viewModel: BookshelfViewModel = viewModel(
                factory = BookshelfViewModel.Factory
            )
            HomeScreen(uiState = viewModel.uiState)
        }
    }
}

@ThemePreviews
@Composable
fun BookshelfAppPreviews() {
    BookshelfApp()
}