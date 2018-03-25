package com.app.artisanpay.data.model


import android.media.session.MediaSession.Token;
import android.util.Log
import java.io.Serializable

/**
 * @author toluadetuyi
 *
 * Model class for Business
 */
class Business : Serializable {

    var tag: String = "message"

    var businessId: String? = null


    var businessName: String? = null


    private var tokens: Token? = null


    fun setTokens(tokens: Token) {
        this.tokens = tokens
    }

    fun getTokens(): String = tokens.toString()

    fun addTwoNum(first: Int, second: Int): Int = first + second

    fun addNum(first: Int = 0, second: Int = 1, third: Int = 1): Int = first + second + third

    fun sumUp() {


        Log.d("[$tag]", addNum(1, third = 4).toString())

    }

}

