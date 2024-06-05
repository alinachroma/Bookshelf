package com.example.bookshelf.model

import kotlinx.serialization.Serializable


@Serializable
data class BooksList(
    val items: List<Item>
)

@Serializable
data class Item(
    val id: String,
    val volumeInfo: VolumeInfo
)

@Serializable
data class VolumeInfo(
    val title: String,
    val authors: List<String>,
    val imageLinks: ImageLinks
)

@Serializable
data class ImageLinks(
    val thumbnail: String
)

