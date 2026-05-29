package oop_00000105419_Cindela.week14

class khs_mahasiswa {
    fun hitung_tugas(quiz: Double, tugasHarian: Double): Double {
        return (quiz * 0.3) + (tugasHarian * 0.7)
    }

    fun hitung_na(tugasMhs: Double, utsMhs: Double, uasMhs: Double, jenisKur: kurikulum_kampus): Double {
        return jenisKur.bobot_nilai(utsMhs, uasMhs, tugasMhs)
    }
}

interface kurikulum_kampus{
    fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double
}

class kur_merdeka:kurikulum_kampus{
    override fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts*0.3) + (uas*0.4) + (tugas*0.3)
    }
}

class kur_2013:kurikulum_kampus{
    override fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts*0.2) + (uas*0.3) + (tugas*0.5)
    }
}

class khs_db{
    fun simpan_nilai(nim:String, nama:String, na:Double):String {
        return "nilai $nim $nama dengan nilai $na berhasil simpan"
    }
    fun load_nilai(nim:String): String {
        return "Load nilai si $nim berhasil"
    }
}

class manager_hitung_nilai {
    fun hitung_NA_mahasiswa(utsSiswa: Double, uasSiswa: Double, quizSiswa: Double, TugasSiswa: Double): Double {
        val khsMhs = khs_mahasiswa()
        val tugasMhs = khsMhs.hitung_tugas(quizSiswa, TugasSiswa)
        val naMhs = khsMhs.hitung_na(tugasMhs, utsSiswa,  uasSiswa, kur_merdeka())
        return naMhs
    }
}

class db_mahasiswa_khs{
    fun save_data_khs(nimMhs:String, namaMhs: String, naMhs:Double): String{
        val kshDB = khs_db()
        val statSimpan = kshDB.simpan_nilai(nimMhs, namaMhs, naMhs)
        return statSimpan
    }
}

fun main(){
    val hitungNilai = manager_hitung_nilai()
    val naMhs: Double = hitungNilai.hitung_NA_mahasiswa(80.56, 90.30, 70.56, 60.90)
    val dbMhs = db_mahasiswa_khs()
    println(dbMhs.save_data_khs("111", "Luffy", naMhs))

    //val naMhs1 = khsMhs.hitung_na(tugasMhs, 70.56, 68.77, kur_merdeka())
    //val naMhs2 = khsMhs.hitung_na(tugasMhs, 70.56, 68.77, kur_2013())

    //val kshDB = khs_db()
    //val statSimpan1 = kshDB.simpan_nilai("123", "Luffy", naMhs1)
    //val statSimpan2 = kshDB.simpan_nilai("234", "Robin", naMhs2)

    //println(statSimpan1)
    //println(statSimpan2)

}