package oop_00000105419_Cindela.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 150.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    println("=== Koin di Wallet ===")
    response.data.forEach { coin ->
        println("- ${coin.name}: ${coin.balance}")
    }

    println("\n=== Riwayat Transaksi ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 1500.0))
    txRepo.add(Transaction("TX002", 50.5))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())
    txResponse.data.forEach { tx ->
        println("- ID: ${tx.id} | Jumlah: ${tx.amount}")
    }

}