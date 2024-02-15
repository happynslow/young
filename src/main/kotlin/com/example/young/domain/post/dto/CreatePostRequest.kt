package com.example.young.domain.post.dto

import com.example.young.domain.post.model.Post

data class CreatePostRequest (
    val title : String,
    val content : String,
    val name : String,
){
    fun toPost(): Post {
        return Post(
            title = title,
            content = content,
            name = name
        )
    }
}