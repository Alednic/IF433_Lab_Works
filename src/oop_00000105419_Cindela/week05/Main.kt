package oop_00000105419_Cindela.week05

fun main(){
    val dosen1 = Dosen("Pak Alex","0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("Aktivitas Pegawai")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Tedeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------------------------------------")
    }

    val ewallet = EWallet("Jay Wallet", 50000.0)
    val creditCard = CreditCard("Jay CC", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (method in paymentMethods) {
        method.processPayment(75000.0)
    }
}