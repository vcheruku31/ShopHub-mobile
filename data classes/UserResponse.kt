data class UserResponse(
    val userId: Int,
    val name: String,
    val email: String,
    val password: String,
    val role: String,
    val isActive: Boolean,
    val address: String
)
