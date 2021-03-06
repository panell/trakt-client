package com.igorwojda.traktclient.core.net.trakt.service

import com.igorwojda.traktclient.core.net.trakt.entity.AccessToken
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Authentication {

	@FormUrlEncoded
	@POST("/oauth/token")
	fun refreshAccessToken(
			@Field("grant_type") grantType: String,
			@Field("refresh_token") refreshToken: String?,
			@Field("client_id") clientId: String,
			@Field("client_secret") clientSecret: String
	): Call<AccessToken>

}
