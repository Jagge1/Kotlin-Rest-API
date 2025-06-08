package com.example.jwttokens.repository

import org.springframework.stereotype.Repository
import com.example.jwttokens.model.Article
import org.springframework.aot.hint.TypeReference.listOf
import java.util.*

@Repository
class ArticleRepository {

    private val articles = listOf(
        Article(id = UUID.randomUUID(), title = "Article 1", content = "Content 1"),
        Article(id = UUID.randomUUID(), title = "Article 2", content = "Content 2")
    )

    fun findAll(): List<Article> =
        //Here is where the code is supposed to connect to a db?
        articles
}