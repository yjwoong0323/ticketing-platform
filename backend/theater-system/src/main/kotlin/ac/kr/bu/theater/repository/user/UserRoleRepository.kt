package ac.kr.bu.theater.repository.user

import ac.kr.bu.theater.domain.user.UserRole
import ac.kr.bu.theater.domain.user.UserRoleId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRoleRepository : JpaRepository<UserRole, UserRoleId> {
    fun findByUser_Id(userId: Long): List<UserRole>
    fun deleteByUser_Id(userId: Long)
    fun existsByUser_IdAndRole_Id(userId: Long, roleId: Long): Boolean
}
