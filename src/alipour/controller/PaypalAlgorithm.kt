package alipour.controller

class PaypalAlgorithm(var email: String, var password: String) : Payment {
    override fun pay(amount: Int) {
        println("$amount paid with PayPal")
    }
}