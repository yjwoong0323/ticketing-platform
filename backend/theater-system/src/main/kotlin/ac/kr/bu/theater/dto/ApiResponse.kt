package ac.kr.bu.theater.dto

/**
 * API 응답 공통 DTO
 */
data class ApiResponse<T>(
    val success: Boolean,
    val data: T? = null,
    val message: String? = null,
    val error: String? = null
) {
    companion object {
        fun <T> success(data: T, message: String? = null): ApiResponse<T> {
            return ApiResponse(true, data, message, null)
        }
        
        fun <T> success(message: String): ApiResponse<T> {
            return ApiResponse(true, null, message, null)
        }
        
        fun <T> error(error: String): ApiResponse<T> {
            return ApiResponse(false, null, null, error)
        }
    }
}
