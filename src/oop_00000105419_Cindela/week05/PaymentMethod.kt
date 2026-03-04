package oop_00000105419_Cindela.week05

abstract class PaymentMethod (
    val accountName: String
){
    abstract fun processPayment(amount: Double)
}