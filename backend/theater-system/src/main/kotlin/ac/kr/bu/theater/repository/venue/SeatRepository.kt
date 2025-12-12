package ac.kr.bu.theater.repository.venue

import ac.kr.bu.theater.domain.venue.Seat
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SeatRepository : JpaRepository<Seat, Long> {
    fun findByVenue_Id(venueId: Long): List<Seat>
    fun countByVenue_Id(venueId: Long): Long
}
