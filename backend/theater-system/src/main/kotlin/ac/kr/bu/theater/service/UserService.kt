package ac.kr.bu.theater.service

import ac.kr.bu.theater.auth.dto.TokenResponse
import ac.kr.bu.theater.auth.dto.UserLoginRequest
import ac.kr.bu.theater.dto.UserMeResponse
import ac.kr.bu.theater.dto.UserSignupRequest
import ac.kr.bu.theater.dto.UserSignupResponse

interface UserService{
    fun createUser(request: UserSignupRequest): UserSignupResponse
    fun login(request: UserLoginRequest): TokenResponse
    fun getMyInfo(userId: Long): UserMeResponse
}