package com.example.finalretrofit

import retrofit2.Response
import retrofit2.http.GET

interface Albumservice {

    @GET("/albums")
    suspend fun getAlbums() : Response<Album>

}