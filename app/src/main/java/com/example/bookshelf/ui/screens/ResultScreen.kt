package com.example.bookshelf.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bookshelf.model.BooksList

@Composable
fun ResultScreen(
    booksData: BooksList,
    modifier: Modifier = Modifier
) {
    Text(text = booksData.items.toString())
}

