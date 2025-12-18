package ac.kr.bu.theater.repository.venue

import ac.kr.bu.theater.domain.venue.Venue
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface VenueRepository : JpaRepository<Venue, Long> {
    fun findByName(name: String): Optional<Venue>
    fun findByBuilding(building: String): List<Venue>
}
