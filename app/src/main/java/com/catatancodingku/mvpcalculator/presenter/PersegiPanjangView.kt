package com.catatancodingku.mvpcalculator.presenter

import com.catatancodingku.mvpcalculator.model.Results

interface PersegiPanjangView {

    fun onCalculateView (resut : Results)

    fun onEmpty()
}