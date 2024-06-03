package com.example.bookshelf.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

sealed interface BookshelfUiState {
    data class Success(val result: String) : BookshelfUiState
    object Loading : BookshelfUiState
    object Error : BookshelfUiState
}

class BookshelfViewModel : ViewModel() {
    var uiState: BookshelfUiState by mutableStateOf(BookshelfUiState.Loading)
        private set

    init {
        getBooksData()
    }

    fun getBooksData() {
        TODO()
    }
}