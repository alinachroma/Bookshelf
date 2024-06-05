package com.example.bookshelf.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bookshelf.ui.BookshelfUiState

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    uiState: BookshelfUiState
) {
    when (uiState) {
        is BookshelfUiState.Success ->
            ResultScreen(
                booksData = uiState.result,
                modifier = modifier.fillMaxSize()
            )

        is BookshelfUiState.Loading -> LoadingScreen()
        is BookshelfUiState.Error -> ErrorScreen()
    }
}

