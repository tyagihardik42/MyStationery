package example.ShopItems

fun main() {

    println("----------------------------------------")
    println("      Hardik's Stationery Store")
    println("----------------------------------------")

    val racerBall = Pen("Racer Ball", 5, 0, "Ball")
    val racerGel = Pen("Racer Gel", 10, 4, "Gel")
    val trimaxGel = Pen("Trimax Pem", 30, 6, "Gel")
    val natraj = Pencil("Natraj Pencil", 5, 10, "Mechanical")
    val apsara = Pencil("Apsara Pencil", 10, 10, "Standard")
    val classmate = Notebook("Classmate 70 R",120, 1,70,"Ruled")
    val navneet = Notebook("Navneet 400 P",220,5,400,"Plain")

    /* Get initial stock status */
    printStockStatus()

    /* make changes to the stock*/
    println("--------------------------------------")
    println("            Changing Quantity            ")
    println("--------------------------------------")
    racerBall.changeQuantity(1)         /* make racerBall positive*/
    natraj.changeQuantity(-10)          /* make natraj zero */
    classmate.changeQuantity(-1)        /* make classmate zero*/

    /* Print stock after changes*/
    printStockStatus()

    println("-----------------------------------")
    println("        Stock in Detail            ")
    println("-----------------------------------")

    racerBall.printItemsInDetail()
    racerGel.printItemsInDetail()
    trimaxGel.printItemsInDetail()
    natraj.printItemsInDetail()
    apsara.printItemsInDetail()
    classmate.printItemsInDetail()
    navneet.printItemsInDetail()

}