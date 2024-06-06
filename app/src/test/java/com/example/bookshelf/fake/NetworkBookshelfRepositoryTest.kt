package com.example.bookshelf.fake

import com.example.bookshelf.data.NetworkBookshelfRepository
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class NetworkBookshelfRepositoryTest {

    @Test
    fun networkBookshelfRepository_getBooksData_verifyBooksList() =
        runTest {
            val repository = NetworkBookshelfRepository(
                bookshelfApiService = FakeBookshelfApiService()
            )
            assertEquals(FakeDataSource.booksList, repository.getBooksData())
        }
}