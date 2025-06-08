package com.example.jwttokens.service
import com.example.jwttokens.model.Article
import com.example.jwttokens.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService (
    private val articleRepository: ArticleRepository
) {
    fun findAll(): List<Article> =
        articleRepository.findAll()
}