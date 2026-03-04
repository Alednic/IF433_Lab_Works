package oop_00000105419_Cindela.week05

class EWallet (accountName: String, var balance: Double): PaymentMethod(accountName) {
        override fun processPayment(amount: Double) {
            if (balance >= amount) {
                balance -= amount
                println("Pembayaran E-Wallet berhasil. Sisa saldo: $balance")
            } else {
                println("Saldo EWallet tidak cukup")
            }
        }

        fun topUp(amount: Double) {
            balance += amount
            println("Top up berhasil. Saldo sekarang: $balance")
        }
}