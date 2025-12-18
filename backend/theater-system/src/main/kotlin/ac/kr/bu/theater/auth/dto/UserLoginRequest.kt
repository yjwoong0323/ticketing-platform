package ac.kr.bu.theater.auth.dto

data class UserLoginRequest(
    val email: String,
    val password: String,
)