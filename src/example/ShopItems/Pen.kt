package example.ShopItems

data class Pen(                                 /*Concept 4: Data classes */
    override var productName: String,
    override var price: Int,
    override var quantity: Int,
    val typeOfPen: String                       /* Type of pen : "Gel" or "Ball" */
) : Items(productName, price, quantity) {       /* Concept 5: Inheritance */

    init {
        if (quantity <= 0) {
            soldOutItem()
        } else {
            addItemToStock()
        }
    }

    override fun printItemsInDetail() {        /* Concept 6: Function Overriding*/
        super.printItemsInDetail()
        println("Type : $typeOfPen")
    }
}