class ProductRepository {
    
    suspend fun getAllProducts(): List<Product> {
        return emptyList()
    }
    
    suspend fun getProductById(productId: Int): Product? {
        return null
    }
    
    suspend fun getProductsByCategory(category: String): List<Product> {
        return emptyList()
    }
    
    suspend fun getActiveProducts(): List<Product> {
        return emptyList()
    }
    
    private fun mapToDomainModel(response: ProductResponse): Product {
        return Product(
            productId = response.productId,
            name = response.name,
            description = "",
            price = response.price,
            stockQuantity = response.stockQuantity,
            category = response.category,
            imageUrl = null,
            isActive = response.isActive
        )
    }
    
    private fun mapToDomainModels(responses: List<ProductResponse>): List<Product> {
        return responses.map { mapToDomainModel(it) }
    }
}
