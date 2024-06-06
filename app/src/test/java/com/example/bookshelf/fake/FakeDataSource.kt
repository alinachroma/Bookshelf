package com.example.bookshelf.fake

import com.example.bookshelf.model.BooksList
import com.example.bookshelf.model.ImageLinks
import com.example.bookshelf.model.Item
import com.example.bookshelf.model.VolumeInfo

object FakeDataSource {
    const val id1 = "1"
    const val id2 = "2"
    const val id3 = "3"
    const val id4 = "4"
    const val title1 = "title1"
    const val title2 = "title2"
    const val title3 = "title3"
    const val title4 = "title4"
    const val thumbnail1 = "thumbnail1"
    const val thumbnail2 = "thumbnail2"
    const val thumbnail3 = "thumbnail3"
    const val thumbnail4 = "thumbnail4"

    val booksList = BooksList(
        listOf(
            Item(
                id = id1,
                volumeInfo = VolumeInfo(
                    title = title1,
                    authors = listOf(),
                    imageLinks = ImageLinks(
                        thumbnail = thumbnail1,
                    )
                )
            ),
            Item(
                id = id2,
                volumeInfo = VolumeInfo(
                    title = title2,
                    authors = listOf(),
                    imageLinks = ImageLinks(
                        thumbnail = thumbnail2,
                    )
                )
            ),
            Item(
                id = id3,
                volumeInfo = VolumeInfo(
                    title = title3,
                    authors = listOf(),
                    imageLinks = ImageLinks(
                        thumbnail = thumbnail3,
                    )
                )
            ),
            Item(
                id = id4,
                volumeInfo = VolumeInfo(
                    title = title4,
                    authors = listOf(),
                    imageLinks = ImageLinks(
                        thumbnail = thumbnail4,
                    )
                )
            )
        )
    )
}