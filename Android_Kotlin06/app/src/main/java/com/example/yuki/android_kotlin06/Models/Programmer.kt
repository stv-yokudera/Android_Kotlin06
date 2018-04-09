package com.example.yuki.android_kotlin06.Models

enum class Rank {
    A,
    B,
    C;
}

class Programmer(
        name: String,
        age: Int,
        sex: Sex,
        address: String,
        baseSalary: Double,
        numberOfProjects: Int,
        rank: Rank)
    : Employee(name, age, sex, address, baseSalary) {

    val numberOfProjects = numberOfProjects
    val rank = rank

    override fun computeYearlyPay(): Double {

        val controlCost = 10000.toDouble()
        return baseSalary + (controlCost * numberOfProjects).toDouble() + getBonusByRank()
    }

    fun getBonusByRank(): Double {
        when(rank) {
            Rank.A -> return 10000.toDouble()
            Rank.B -> return 7000.toDouble()
            Rank.C -> return 4000.toDouble()
        }
    }
}