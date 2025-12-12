package ac.kr.bu.theater.repository.board

import ac.kr.bu.theater.domain.board.BoardComment
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardCommentRepository : JpaRepository<BoardComment, Long> {
    fun findByBoard_Id(boardId: Long, pageable: Pageable): Page<BoardComment>
    fun findByWriter_Id(writerId: Long, pageable: Pageable): Page<BoardComment>
    fun countByBoard_Id(boardId: Long): Long
    fun deleteByBoard_Id(boardId: Long)
}
