data class OrderItemResponse(
    val product: ProductResponse,
    val quantity: Int,
    val priceAtPurchase: Double,
    val currency: String
)
