package com.example.bookshelf.fake

import com.example.bookshelf.rules.TestDispatcherRule
import com.example.bookshelf.ui.BookshelfUiState
import com.example.bookshelf.ui.BookshelfViewModel
import kotlinx.coroutines.test.runTest
import junit.framework.TestCase.assertEquals
import org.junit.Rule
import org.junit.Test

class BookshelfViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()
    @Test
    fun bookshelfViewModel_getBooks_verifyBookshelfUiStateSuccess() =
        runTest {
            val repository = FakeBookshelfRepository()
            val viewModel = BookshelfViewModel(repository)
            assertEquals(
                BookshelfUiState.Success(FakeDataSource.booksList),
                viewModel.uiState
            )
        }
}