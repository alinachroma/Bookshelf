package com.example.bookshelf.fake

import com.example.bookshelf.model.BooksList
import com.example.bookshelf.network.BookshelfApiService

class FakeBookshelfApiService : BookshelfApiService {
    override suspend fun getBooksData(): BooksList {
        return FakeDataSource.booksList
    }
}