package com.example.shaxrizod.models

import java.io.Serializable


data class Place(var name: String?, var location: String?, var image: Int?, var webLink: String?,
                 var phoneAdress: String?,   var description: String?,
                 var lat: Double?,   var long: Double? ) : Serializable
