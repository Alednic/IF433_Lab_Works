package oop_00000105419_Cindela.week03

class Pelajar{
    private var nama = "belum ada nama";
    private var nilai: Int = 0;

    public fun set_nama(namaorang:String){
        if(namaorang.length < 0){
            println("nama orang tidak boleh kosong");
        }else {
            this.nama = namaorang;
        }
    }
    public fun get_nama():String{
        return this.nama;
    }

    public fun set_nilai(nilai: Int){
        if(nilai < 0){
            println("Nilai tidak boleh minus")
        }else{
            this.nilai = nilai;
        }
    }

    public fun get_nilai():Int{
        return this.nilai;
    }
}
fun main(){
    var mahasiswa = Pelajar();
    //mahasiswa.nama = "Budi"
    //mahasiswa.nilai = -20;
    mahasiswa.set_nama("udin");
    mahasiswa.set_nilai(70)
    println("Nama kamu adalah ${mahasiswa.get_nama()}");
    println("Nilai kamu ${mahasiswa.get_nilai()}");

    //println("hai "+ mahasiswa.nama + " nilai kamu ${mahasiswa.nilai}");
}