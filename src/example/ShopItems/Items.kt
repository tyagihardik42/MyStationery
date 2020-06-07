/* Items class declaration
*  Forms the basis of all the classes*/

package example.ShopItems

import java.lang.StrictMath.abs
                                                        /*Concept 1: Visibility Modifiers*/
internal val soldOutItems = mutableListOf<String>()          /** List of sold out items */
internal val availableItems = mutableListOf<String>()        /** List of available items */


abstract class Items(                               /* Concept 2: Abstract class */
    open var productName: String,
    open var price: Int,
    open var quantity: Int
) {

    fun addItemToStock() {
        /** add item to availableItems list */
        availableItems.add(productName)
    }

    fun soldOutItem() {
        /** add item to soldOutItem list */
        soldOutItems.add(productName)

    }

    fun changeQuantity(changeValue: Int) {
        /*
        * change quantity value and readjust the lists
        * for increment -> changeValue is positive
        * for decrement -> changeValue is negative */

        quantity = quantity + changeValue

        if (quantity <= 0) {
            soldOutItems.add(productName)
            availableItems.remove(productName)
            println("${abs(changeValue)} '$productName' removed")               /*Concept 3: String templates*/
        } else if (quantity >= 0 && soldOutItems.contains(productName)){
            soldOutItems.remove(productName)
            availableItems.add(productName)
            println("${abs(changeValue)} '$productName' added")                 /*Concept 3: String templates*/
        }
    }

    val totalPrice: (Int,Int) -> (Int) = {quantity,price -> quantity*price}     /* Concept 7: Declaration of Lambda function*/
    open fun printItemsInDetail() {
        /* print all details of the item */
        println("--------------------")                                        /*Concept 3: String Templates*/
        println("Item : $productName")
        println("Price : $price")
        println("Quantity : $quantity")
        println("Worth of Stock(Rs.) : ${totalPrice(quantity,price)}")      /* Concept 7: Lambda function*/
    }
}



