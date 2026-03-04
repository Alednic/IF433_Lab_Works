package oop_00000105419_Cindela.week05

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran Credit Card berhasil. Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak: melebihi limit")
        }
    }
}