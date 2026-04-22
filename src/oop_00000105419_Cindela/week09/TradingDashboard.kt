package oop_00000105419_Cindela.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 45.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 5.0, "OPEN"),
        TradeLog("DOGEUSDT", "SHORT", 5, 2.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}