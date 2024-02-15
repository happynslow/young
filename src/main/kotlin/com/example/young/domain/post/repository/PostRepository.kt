package com.example.young.domain.post.repository

import com.example.young.domain.post.dto.PostResponse
import com.example.young.domain.post.model.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<Post,Long> {

    fun findAllByOrderByCreatedAtDesc(): List<PostResponse>
    fun findAllByOrderByCreatedAtAsc(): List<PostResponse>
}