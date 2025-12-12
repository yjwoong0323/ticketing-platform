package ac.kr.bu.theater.dto

import java.time.LocalDateTime

data class UserMeResponse(
    val id: Long,
    val email: String,
    val name: String,
    val phone: String,
    val status: Boolean = true,
    val createdAt: LocalDateTime
)