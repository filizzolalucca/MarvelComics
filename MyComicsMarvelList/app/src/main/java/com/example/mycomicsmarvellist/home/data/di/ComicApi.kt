package com.example.mycomicsmarvellist.home.data.di

import com.example.mycomicsmarvellist.home.entity.ComicBookList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ComicApi {
    @GET("")
    suspend fun pegarComicList(@Query("sort") order:String,
                               @Query("page") page:String
                               ): Response<ComicBookList>
}