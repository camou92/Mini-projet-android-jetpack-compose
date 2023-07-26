package com.camoutech.firstapp.data

import com.camoutech.firstapp.R
import com.camoutech.firstapp.model.Content
import com.camoutech.firstapp.model.DataAnalytic
import com.camoutech.firstapp.model.DataRevenue

object Data {
    val analyticsData = listOf(
        DataAnalytic("Vues", "86,6 K"),
        DataAnalytic("Revenus", "234 \$US")
    )

    val revenueData = listOf(
        DataRevenue("Mars (En cours)", 450f),
        DataRevenue("Février", 428f),
        DataRevenue("Janvier", 321f)
    )

    val lastContent = listOf(
        Content(
            "Apprenez le developpement Android",
            "Il y a 4 jours",
            R.drawable._600w_uca52bz7bqk,
            199,202,999
        ),
        Content(
            "La programmation avec le langage Kotlin",
            "Il y a 2 semaines",
            R.drawable._600w_wk95f3xnram,
            700,603,659
        ),
        Content(
            "Créer une API REST avec NodeJs et MongoDB",
            "Il y a 4 mois",
            R.drawable._600w_z0_c2ql6i7k,
            199,202,999
        )
    )
}