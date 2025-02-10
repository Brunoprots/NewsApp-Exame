package com.example.news_app.network

import com.example.news_app.model.News
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {
    @GET("/svc/mostpopular/v2/emailed/1.json?api-key=${Constants.KEY}")
    suspend fun getMostPopularNews() : Response<News>
}