package com.example.bookshelf.utils

import com.example.bookshelf.model.ImageLinks
import com.example.bookshelf.model.Item
import com.example.bookshelf.model.VolumeInfo

val fakeDataSourceForPreviews = listOf(
    Item(
        id = "1",
        volumeInfo = VolumeInfo(
            title = "title1", authors = listOf(), imageLinks = ImageLinks(
                thumbnail = "thumbnail",
            )
        )
    ),
    Item(
        id = "2",
        volumeInfo = VolumeInfo(
            title = "title2", authors = listOf(), imageLinks = ImageLinks(
                thumbnail = "thumbnail",
            )
        )
    ),
    Item(
        id = "3",
        volumeInfo = VolumeInfo(
            title = "title3", authors = listOf(), imageLinks = ImageLinks(
                thumbnail = "thumbnail",
            )
        )
    ),
    Item(
        id = "4",
        volumeInfo = VolumeInfo(
            title = "title4", authors = listOf(), imageLinks = ImageLinks(
                thumbnail = "thumbnail",
            )
        )
    )
)