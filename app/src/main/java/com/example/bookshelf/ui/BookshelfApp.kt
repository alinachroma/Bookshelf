package com.example.bookshelf.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bookshelf.ui.items.BookshelfTopBar
import com.example.bookshelf.ui.screens.HomeScreen
import com.example.bookshelf.utils.ThemePreviews

@Composable
fun BookshelfApp(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = { BookshelfTopBar() },
    ) {
        Surface(
            modifier = modifier
                .fillMaxSize()
                .padding(it),
            color = Color.Black
        ) {
            val viewModel: BookshelfViewModel = viewModel(
                factory = BookshelfViewModel.Factory
            )
            HomeScreen(
                uiState = viewModel.uiState,
                retryAction = viewModel::getBooksData,
            )
        }
    }
}

@ThemePreviews
@Composable
fun BookshelfAppPreviews() {
    BookshelfApp()
}
