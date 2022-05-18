package alipour.controller

class CreditCardAlgorithm(var name: String, var cardNumber: String) : Payment {
    override fun pay(amount: Int) {
        println("$amount paid with card")
    }
}