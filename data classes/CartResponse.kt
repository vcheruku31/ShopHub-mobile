data class CartResponse(
    val cartId: Int,
    val user: UserResponse,
    val items: List<OrderItemResponse>
)
