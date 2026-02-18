package oop_00000105419_Cindela.week03
class Employee(val name: String) {
    var salary: Int = 0
        set(value){
            println("Mencoba set gaji ke: $value")
            this.salary = value;
        }
}