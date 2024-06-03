package com.example.bookshelf.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bookshelf.utils.ThemePreviews

@Composable
fun BookshelfApp(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Scaffold { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                Text(text = "TEXTTEXTTEXT")
            }
        }
    }
}

@ThemePreviews
@Composable
fun BookshelfAppPreviews() {
    BookshelfApp()
}