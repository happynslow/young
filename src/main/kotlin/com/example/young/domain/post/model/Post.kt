package com.example.young.domain.post.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Entity
class Post (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long? = null,

    @Column(name = "title")
    var title : String,

    @Column(name = "content")
    var content : String,

    @Column(name = "name")
    var name : String,

    ){

    @Column(name = "Created_At")
    var createdAt : String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd HH-mm"))
}