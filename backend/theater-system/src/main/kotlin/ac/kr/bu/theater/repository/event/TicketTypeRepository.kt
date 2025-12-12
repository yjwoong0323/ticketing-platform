package ac.kr.bu.theater.repository.event

import ac.kr.bu.theater.domain.event.TicketType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TicketTypeRepository : JpaRepository<TicketType, Long> {
    fun findByEvent_Id(eventId: Long): List<TicketType>
    fun findByEvent_IdAndValidTrue(eventId: Long): List<TicketType>
}
