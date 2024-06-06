package com.example.bookshelf.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bookshelf.model.BooksList
import com.example.bookshelf.ui.BookshelfUiState
import com.example.bookshelf.ui.theme.BookshelfTheme
import com.example.bookshelf.utils.ThemePreviews
import com.example.bookshelf.utils.fakeDataSourceForPreviews

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    uiState: BookshelfUiState,
    retryAction: () -> Unit,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    when (uiState) {
        is BookshelfUiState.Success ->
            ResultScreen(
                booksData = uiState.result,
                contentPadding = contentPadding,
                modifier = modifier.fillMaxSize()
            )

        is BookshelfUiState.Loading -> LoadingScreen()
        is BookshelfUiState.Error -> ErrorScreen(retryAction = retryAction)
    }
}

@ThemePreviews
@Composable
fun HomeScreenPreviews() {
    BookshelfTheme {
        HomeScreen(
            uiState = BookshelfUiState.Success(
                result = BooksList(
                    items = fakeDataSourceForPreviews
                )
            ),
            retryAction = {}
        )
    }
}
