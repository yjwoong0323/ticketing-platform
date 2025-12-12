package ac.kr.bu.theater.repository.board

import ac.kr.bu.theater.domain.board.FreeBoard
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FreeBoardRepository : JpaRepository<FreeBoard, Long> {
    fun findByWriter_Id(writerId: Long, pageable: Pageable): Page<FreeBoard>
    fun findByInNoticeTrue(pageable: Pageable): Page<FreeBoard>
    fun findByInNoticeFalse(pageable: Pageable): Page<FreeBoard>
    fun findByTitleContainingOrContentContaining(title: String, content: String, pageable: Pageable): Page<FreeBoard>
}
