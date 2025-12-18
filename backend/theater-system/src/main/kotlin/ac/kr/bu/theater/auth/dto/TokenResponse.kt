package ac.kr.bu.theater.auth.dto

data class TokenResponse(
    val accessToken: String,
    val refreshToken: String
)