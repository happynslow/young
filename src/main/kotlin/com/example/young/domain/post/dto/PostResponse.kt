package com.example.young.domain.post.dto

import com.example.young.domain.post.model.Post

data class PostResponse (
    val id : Long?,
    val title : String,
    val content : String,
    val name : String
){
    companion object{
        fun toPostResponse(post: Post): PostResponse{
            return PostResponse(
                id = post.id,
                title = post.title,
                content = post.content,
                name = post.name

            )
        }
    }
}