package oop_00000105419_Cindela.week04

class Baju:Pakaian() {
    private var stock:Int = 10;
    public fun update_stock(terjual:Int){
        super.harga = stock * 100;
        println("Stock $stock baju terupdate," + "harga ${super.harga}");
    }
}