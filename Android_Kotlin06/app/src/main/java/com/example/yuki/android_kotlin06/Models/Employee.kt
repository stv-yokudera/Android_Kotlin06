package com.example.yuki.android_kotlin06.Models

enum class Sex {
    WOMAN,
    MAN;
}

abstract class Employee(name: String, age: Int, sex: Sex, address: String, baseSalary: Double) {

    val name = name
    val age = age
    val sex = sex.toString()
    val address = address
    val baseSalary = baseSalary

    abstract fun computeYearlyPay(): Double
}