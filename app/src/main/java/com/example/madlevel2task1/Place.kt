package com.example.madlevel2task1

import androidx.annotation.DrawableRes

data class Place(var name: String, @DrawableRes var imageResId: Int) {

    companion object {
        val PLACE_NAMES = arrayOf(
            "Amsterdam Dam",
            "Amsterdam Weesperplein",
            "Rotterdam Euromast",
            "Den Haag Binnenhof",
            "Utrecht Dom",
            "Groningen Martinitoren",
            "Maastricht Vrijthof",
            "New York Vrijheidsbeeld",
            "San Francisco Golden Gate",
            "Yellowstone Old Faithful",
            "Yosemite Half Dome",
            "Washington White House",
            "Ottawa Parliament Hill",
            "Londen Tower Bridge",
            "Brussel Manneken Pis",
            "Berlijn Reichstag",
            "Parijs Eiffeltoren",
            "Barcelona Sagrada Familia",
            "Rome Colosseum",
            "Pompeii",
            "Kopenhagen",
            "Oslo",
            "Stockholm",
            "Helsinki",
            "Moskou Rode Plein",
            "Beijing Verboden Stad",
            "Kaapstad Tafelberg",
            "Rio de Janeiro Copacabana",
            "Sydney Opera",
            "Hawaii Honolulu",
            "Alaska Denali"
        )

    }

}