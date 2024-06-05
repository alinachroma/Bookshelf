package com.example.bookshelf.network

import com.example.bookshelf.model.BooksList
import retrofit2.http.GET

interface BookshelfApiService {
    @GET("?q=photography+history")
    suspend fun getBooksData() : BooksList
}