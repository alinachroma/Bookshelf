package com.example.bookshelf.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.bookshelf.BookshelfApplication
import com.example.bookshelf.data.BookshelfRepository
import com.example.bookshelf.model.BooksList
import kotlinx.coroutines.launch
import java.io.IOException

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
        viewModelScope.launch {
            uiState = try {
                val result = bookshelfRepository.getBooksData()
                BookshelfUiState.Success(result)
            } catch (e: IOException) {
                BookshelfUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as BookshelfApplication)
                val bookshelfRepository = application.container.repository
                BookshelfViewModel(bookshelfRepository = bookshelfRepository)
            }
        }
    }
}