package com.example.yuki.android_kotlin06.Models

class Designer(
        name: String,
        age: Int,
        sex: Sex,
        address: String,
        baseSalary: Double,
        numberOfProjects: Int)
    : Employee(name, age, sex, address, baseSalary) {

    val numberOfProjects = numberOfProjects

    override fun computeYearlyPay(): Double {

        val controlCost = 10000.toDouble()
        return baseSalary + (controlCost * numberOfProjects).toDouble()
    }
}