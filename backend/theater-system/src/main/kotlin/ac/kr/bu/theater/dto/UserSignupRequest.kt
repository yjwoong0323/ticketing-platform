package ac.kr.bu.theater.dto

data class UserSignupRequest(
    val email: String,
    val password: String,
    val name: String,
    val phone: String,
)