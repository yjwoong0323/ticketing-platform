package ac.kr.bu.theater.dto

import java.time.LocalDateTime

data class UserSignupResponse(
    val id: Long,
    val email: String,
    val name: String,
    val phone: String,
    val status: Boolean = true,
    val enrolledStudent: Boolean = false,
    val createdAt: LocalDateTime,
)