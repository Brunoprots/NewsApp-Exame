package com.example.news_app.repositories

import com.example.news_app.model.News
import com.example.news_app.network.NewsApi

class NewsRepository(private val api: NewsApi): NewsRepositoryInt {

    override suspend fun fetchAllNews(): News {
        try {
            return api.getApiNews().getMostPopularNews().body()!!
        } catch (e: Exception) {
            throw e
        }
    }
}