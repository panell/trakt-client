package com.igorwojda.traktclient.core.net.trakt.extension

import okhttp3.Response

val Response.numPriorResponses:Int
	get() {
		var result = 0
		var response:Response? = this

		while (response != null) {
			response = response.priorResponse()
			result++
		}

		return result
	}