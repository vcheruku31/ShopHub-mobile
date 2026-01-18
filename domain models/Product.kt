data class Product(
    val productId: Int,
    val name: String,
    val description: String,
    val price: Double,
    val currency: String,
    val stockQuantity: Int,
    val category: String,
    val imageUrl: String?,
    val isActive: Boolean
) {
    fun isInStock(): Boolean {
        return stockQuantity > 0
    }

    fun updateStock(quantity: Int): Product {
        return copy(stockQuantity = quantity)
    }
}
