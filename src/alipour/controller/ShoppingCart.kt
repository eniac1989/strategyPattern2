package alipour.controller

import alipour.model.Product
import java.awt.image.BufferStrategy

class ShoppingCart(var productList: ArrayList<Product> = ArrayList<Product>()) {

    fun addProduct(product: Product) {
        productList.add(product)
    }

    fun removeProduct(product: Product) {
        productList.remove(product)
    }

    fun calculateTotal():Int{
       var sum=0
        for(product in productList){
            sum+=product.price
        }
        return sum
    }

    fun pay(paymentStrategy: Payment){
        var amount=calculateTotal()
        paymentStrategy.pay(amount)
    }

}