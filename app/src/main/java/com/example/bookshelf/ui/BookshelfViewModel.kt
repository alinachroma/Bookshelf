package com.example.bookshelf.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

sealed interface BookshelfUiState {
    data class Success(val result: BooksList) : BookshelfUiState
    object Loading : BookshelfUiState
    object Error : BookshelfUiState
}

class BookshelfViewModel(private val bookshelfRepository: BookshelfRepository) :
    ViewModel() {
    var uiState: BookshelfUiState by mutableStateOf(BookshelfUiState.Loading)
        private set

    init {
        getBooksData()
    }

    fun getBooksData() {
        TODO()
    }
}