package com.example.young.domain.post.service

import com.example.young.domain.post.dto.CreatePostRequest
import com.example.young.domain.post.dto.PostResponse
import com.example.young.domain.post.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(
    private val postRepository : PostRepository
): PostService {

    //트랜잭션써야함
    override fun createPost (request: CreatePostRequest
    ): PostResponse{
        val post = postRepository.save(request.toPost())
        return PostResponse.toPostResponse(post)
    }

}