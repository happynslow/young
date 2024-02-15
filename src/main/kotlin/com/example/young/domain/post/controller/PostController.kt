package com.example.young.domain.post.controller

import com.example.young.domain.post.dto.CreatePostRequest
import com.example.young.domain.post.dto.PostResponse
import com.example.young.domain.post.service.PostService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/posts")
@RestController
class PostController {
    @PostMapping
    fun createPost(
        @RequestBody createPostRequest: CreatePostRequest
    ): ResponseEntity<Any> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body("게시글이 생성되었습니다.")

    }


}