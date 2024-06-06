package com.example.bookshelf.fake

import com.example.bookshelf.data.BookshelfRepository
import com.example.bookshelf.data.NetworkBookshelfRepository
import com.example.bookshelf.model.BooksList

class FakeBookshelfRepository : BookshelfRepository {
    override suspend fun getBooksData(): BooksList {
        return FakeDataSource.booksList
    }
}