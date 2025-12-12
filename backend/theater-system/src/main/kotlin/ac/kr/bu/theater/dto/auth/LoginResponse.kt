package ac.kr.bu.theater.dto.auth

/**
 * 로그인 응답 DTO
 */
data class LoginResponse(
    val userId: Long,
    val email: String,
    val name: String,
    val studentNo: String?,
    val enrolledStudent: Boolean,
    val roles: List<String>
)
