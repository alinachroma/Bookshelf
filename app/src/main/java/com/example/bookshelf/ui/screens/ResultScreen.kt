package com.example.bookshelf.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bookshelf.model.BooksList
import com.example.bookshelf.ui.items.BookCard

@Composable
fun ResultScreen(
    modifier: Modifier = Modifier,
    booksData: BooksList,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Adaptive(150.dp),
        content = {
            items(
                items = booksData.items, key = { book -> book.id }
            ) {
                BookCard(
                    book = it,
                    modifier = Modifier.aspectRatio(0.8f)
                )
            }
        },
        contentPadding = contentPadding,
    )
}


