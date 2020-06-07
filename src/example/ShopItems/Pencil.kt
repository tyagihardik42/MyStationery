package example.ShopItems

data class Pencil(                              /* Concept 4: Data Class*/
    override var productName: String,
    override var price: Int,
    override var quantity: Int,
    val typeOfPencil: String                    /* Type of Pencil = "Mechanical" or "Standard"*/
) : Items(productName, price, quantity) {       /*Concept 5: Inheritance*/

    init {
        if (quantity <= 0) {
            soldOutItem()
        } else {
            addItemToStock()
        }
    }

    override fun printItemsInDetail() {         /*Concept 6: Function Overriding*/
        super.printItemsInDetail()
        println("Type : $typeOfPencil")
    }

}