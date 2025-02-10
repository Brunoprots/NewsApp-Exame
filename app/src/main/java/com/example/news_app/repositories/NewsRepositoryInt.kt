package com.example.news_app.repositories

import com.example.news_app.model.News

interface NewsRepositoryInt {
    suspend fun fetchAllNews() : News
}