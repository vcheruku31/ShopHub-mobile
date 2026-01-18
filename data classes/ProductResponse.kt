data class ProductResponse(
    val productId: Int,
    val name: String,
    val price: Double,
    val currency: String,
    val stockQuantity: Int,
    val category: String,
    val isActive: Boolean
)
