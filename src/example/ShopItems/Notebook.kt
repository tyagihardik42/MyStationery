package example.ShopItems

data class Notebook(                             /* Concept 4: Data Class*/
    override var productName: String,
    override var price: Int,
    override var quantity: Int,
    val noOfPages: Int,
    val typeOfNotebook: String                   /* Type of notebook = "Ruled" or "Plain"*/
) : Items(productName, price, quantity) {        /* Concept 5: Inheritance*/

    init {
        if (quantity <= 0) {
            soldOutItem()
        } else {
            addItemToStock()
        }
    }

    override fun printItemsInDetail() {          /* Concept 6: Function Overriding*/
        super.printItemsInDetail()
        println("No of pages : $noOfPages")
        println("Type : $typeOfNotebook")
    }

}