package ru.netology.nmedia.dto

data class Post(
        val id: Long,
        val author: String,
        var published: String,
        val content: String,
        val likedByMe: Boolean,
        val likes: Int = 0,
        val shares: Int = 0,
        val visibles: Int = 0,
        val videoVisibility: Int = 4,
        var video: String? = " "
)