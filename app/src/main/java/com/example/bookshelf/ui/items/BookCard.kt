package com.example.bookshelf.ui.items

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.bookshelf.R
import com.example.bookshelf.model.Item

@Composable
fun BookCard(
    book: Item,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.padding(dimensionResource(id = R.dimen.padding_small))) {
        AsyncImage(
            model = ImageRequest.Builder(context = LocalContext.current)
                .data(
                    book.volumeInfo.imageLinks.thumbnail
                        .replace("http", "https")
                )
                .crossfade(true)
                .build(),
            contentDescription = null,
            placeholder = painterResource(id = R.drawable.loading_img),
            error = painterResource(id = R.drawable.ic_connection_error),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
    }
}