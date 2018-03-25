package com.app.artisanpay.data.model

/**
 * Created by toluadetuyi on 12/12/17.
 */
data class Artisan(var id: Int, var username: String, var fname: String, var lastName: String,
                   var imgUrl: String = "", var business: Business)