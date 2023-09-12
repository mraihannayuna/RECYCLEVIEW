package com.example.bljarrecyleview.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class dataClass(
    val name: String,
    val description: String,
    val image: Int,
) : Parcelable
