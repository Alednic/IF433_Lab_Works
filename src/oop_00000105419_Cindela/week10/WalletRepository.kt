package oop_00000105419_Cindela.week10

class WalletRepository<T: Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}