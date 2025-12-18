package ac.kr.bu.theater.repository.event

import ac.kr.bu.theater.domain.event.EventSchedule
import ac.kr.bu.theater.domain.event.ScheduleStatus
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface EventScheduleRepository : JpaRepository<EventSchedule, Long> {
    fun findByEvent_Id(eventId: Long): List<EventSchedule>
    fun findByEvent_IdAndStatus(eventId: Long, status: ScheduleStatus): List<EventSchedule>
    fun findByStartsAtBetween(start: LocalDateTime, end: LocalDateTime): List<EventSchedule>
    fun findByStatus(status: ScheduleStatus): List<EventSchedule>
}
