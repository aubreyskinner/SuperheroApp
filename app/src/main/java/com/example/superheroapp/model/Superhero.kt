package com.example.superheroapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Superhero(
    @DrawableRes val imageResourceId: Int,
    @StringRes val hero: Int,
    @StringRes val description: Int,
    @StringRes val vulnerability: Int,
    @StringRes val detail: Int
)