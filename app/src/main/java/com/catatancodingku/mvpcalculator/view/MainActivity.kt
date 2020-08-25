package com.catatancodingku.mvpcalculator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.catatancodingku.mvpcalculator.R
import com.catatancodingku.mvpcalculator.model.Results
import com.catatancodingku.mvpcalculator.presenter.PersegiPanjangPresenter
import com.catatancodingku.mvpcalculator.presenter.PersegiPanjangView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var presenter : PersegiPanjangPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = PersegiPanjangPresenter(object : PersegiPanjangView {
            override fun onCalculateView(resut: Results) {

                tv_result.text = resut.result.toString()
            }

            override fun onEmpty() {
                Toast.makeText(applicationContext, "Isi semua Form", Toast.LENGTH_SHORT).show()
            }

        })

        btn_plus.setOnClickListener() {
            val value1 = ed_value1.text.toString()
            val value2 = ed_value2.text.toString()
            presenter.calculate(value1,value2,"+")
        }
        btn_minus.setOnClickListener() {
            val value1 = ed_value1.text.toString()
            val value2 = ed_value2.text.toString()
            presenter.calculate(value1, value2, "-")
        }
        btn_div.setOnClickListener() {
            val value1 = ed_value1.text.toString()
            val value2 = ed_value2.text.toString()
            presenter.calculate(value1,value2,"/")
        }
        btn_times.setOnClickListener() {
            val value1 = ed_value1.text.toString()
            val value2 = ed_value2.text.toString()
            presenter.calculate(value1,value2,"*")
        }
    }
}