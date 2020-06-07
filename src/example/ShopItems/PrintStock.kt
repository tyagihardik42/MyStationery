package example.ShopItems

fun printStockStatus() {
    /** Print the overall status of stock */
    println("---------------")
    println("Available items")
    println("---------------")
    for(it in availableItems){
        println(it)

    }
    println("---------------")
    println("Sold out items")
    println("---------------")
    for(it in soldOutItems){
        println(it)

    }
}