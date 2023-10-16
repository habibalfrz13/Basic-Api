package com.habib.jobsheet6.api

import retrofit2.Call
import com.habib.jobsheet6.ResponseMorphy
import retrofit2.Retrofit
import retrofit2.http.GET

interface ApiService {
    @GET ("character")
    fun getMorphy () : Call<ResponseMorphy>
}