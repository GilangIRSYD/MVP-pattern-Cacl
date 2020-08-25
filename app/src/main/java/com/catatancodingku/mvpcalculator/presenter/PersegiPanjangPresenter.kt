package com.catatancodingku.mvpcalculator.presenter

import com.catatancodingku.mvpcalculator.model.Results

class PersegiPanjangPresenter (val persegiPanjangView: PersegiPanjangView) {


    fun calculate (value1 : String , value2 : String, operator : String){

        if (value1.isEmpty() || value2.isEmpty()){
            persegiPanjangView.onEmpty()
            return
        }
        val cValue1 = value1.toDouble()
        val cValue2 = value2.toDouble()
        var result = 0.0

        when(operator){
            "+" -> result = cValue1.plus(cValue2)
            "-" -> result = cValue1.minus(cValue2)
            "/" -> result = cValue1.div(cValue2)
            "*" -> result = cValue1.times(cValue2)
        }

        val results = Results()
        results.result = result

        persegiPanjangView.onCalculateView(results)

    }
}