package com.rmnivnv.cryptomoon.network

import com.google.gson.JsonObject
import com.rmnivnv.cryptomoon.model.AllCoinsResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * Created by rmnivnv on 11/07/2017.
 */
interface CryptoCompareAPI {

    @GET
    fun getCoinsList(@Url url: String): Observable<AllCoinsResponse>

    @GET("pricemultifull")
    fun getPrice(@Query("fsyms") from: String, @Query("tsyms") to: String): Observable<JsonObject>
}