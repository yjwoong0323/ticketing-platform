package ac.kr.bu.theater.repository.board

import ac.kr.bu.theater.domain.board.BoardLike
import ac.kr.bu.theater.domain.board.BoardLikeId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardLikeRepository : JpaRepository<BoardLike, BoardLikeId> {
    fun countByBoard_Id(boardId: Long): Long
    fun existsByUser_IdAndBoard_Id(userId: Long, boardId: Long): Boolean
    fun deleteByBoard_Id(boardId: Long)
    fun findByUser_Id(userId: Long): List<BoardLike>
}
