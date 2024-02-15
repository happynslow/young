package com.example.young.domain.post.service

import com.example.young.domain.post.dto.CreatePostRequest
import com.example.young.domain.post.dto.PostResponse

interface PostService {
    fun createPost (request: CreatePostRequest): PostResponse
}