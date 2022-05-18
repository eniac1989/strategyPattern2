package alipour

import alipour.controller.CreditCardAlgorithm
import alipour.controller.PaypalAlgorithm
import alipour.controller.ShoppingCart
import alipour.model.Product


    fun main() {
        var cart = ShoppingCart()
        var pants = Product(upcCode = "234", price = 25)
        var shirts = Product(upcCode = "987", price = 15)
        cart.addProduct(pants)
        cart.addProduct(shirts)

        cart.pay(PaypalAlgorithm(email = "alipourpaniz@gmail.com", password = "1234"))
        cart.pay(CreditCardAlgorithm(name = "Paulo", cardNumber = "65675657"))
    }
