package com.example.yuki.android_kotlin06.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.yuki.android_kotlin06.Models.Designer
import com.example.yuki.android_kotlin06.Models.Programmer
import com.example.yuki.android_kotlin06.Models.Rank
import com.example.yuki.android_kotlin06.Models.Sex
import com.example.yuki.android_kotlin06.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showYearlyIncome()
    }

    private fun showYearlyIncome() {
        val designer = Designer("Hana", 21, Sex.WOMAN, "caaa", 2500.toDouble(), 10)
        val pg = Programmer("Jiro", 25, Sex.MAN, "baa", 3000.toDouble(), 20, Rank.C)

        Log.d("Designer", "Hana: ${ designer.computeYearlyPay() }")
        Log.d("Programmer", "Jiro: ${ pg.computeYearlyPay() }")
        Log.d("Programmer", "Jiro(Bonus): ${ pg.getBonusByRank() }")
    }
}
