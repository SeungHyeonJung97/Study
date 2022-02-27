package com.example.studyexample

object IdFactory{
    val accountList = mutableListOf<Account>()

    fun makeId(Id: String): Account{
        val Id = Account(Id)
        accountList.add(Id)
        return Id
    }
}

data class Account(val Id: String)

fun main(){
    val account1 = IdFactory.makeId("Ashe")
    val account2 = IdFactory.makeId("Garen")

    println(account1)
    println(account2)
    println(IdFactory.accountList.size)
}