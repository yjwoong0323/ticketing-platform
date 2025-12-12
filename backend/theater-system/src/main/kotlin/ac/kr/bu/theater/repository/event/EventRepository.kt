package ac.kr.bu.theater.repository.event

import ac.kr.bu.theater.domain.event.ApprovalStatus
import ac.kr.bu.theater.domain.event.Event
import ac.kr.bu.theater.domain.event.EventType
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface EventRepository : JpaRepository<Event, Long> {
    fun findByOrganization_Id(orgId: Long, pageable: Pageable): Page<Event>
    fun findByType(type: EventType, pageable: Pageable): Page<Event>
    fun findByApprovalStatus(status: ApprovalStatus, pageable: Pageable): Page<Event>
    fun findByCreatedBy_Id(createdById: Long, pageable: Pageable): Page<Event>
    fun findByVisibleFromLessThanEqualAndVisibleToGreaterThanEqual(
        now1: LocalDateTime,
        now2: LocalDateTime,
        pageable: Pageable
    ): Page<Event>
    fun findByApprovalStatusAndVisibleFromLessThanEqualAndVisibleToGreaterThanEqual(
        status: ApprovalStatus,
        now1: LocalDateTime,
        now2: LocalDateTime,
        pageable: Pageable
    ): Page<Event>
}