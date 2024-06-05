package com.example.bookshelf.data

import com.example.bookshelf.model.BooksList
import com.example.bookshelf.network.BookshelfApiService

interface BookshelfRepository {
    suspend fun getBooksData(): BooksList
}

class NetworkBookshelfRepository(
    private val bookshelfApiService: BookshelfApiService
) : BookshelfRepository {
    override suspend fun getBooksData(): BooksList = bookshelfApiService.getBooksData()
}