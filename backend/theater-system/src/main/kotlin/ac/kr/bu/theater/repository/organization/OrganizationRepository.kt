package ac.kr.bu.theater.repository.organization

import ac.kr.bu.theater.domain.organization.Organization
import ac.kr.bu.theater.domain.organization.OrganizationType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface OrganizationRepository : JpaRepository<Organization, Long> {
    fun findByOwner_Id(ownerId: Long): List<Organization>
    fun findByType(type: OrganizationType): List<Organization>
    fun findByName(name: String): Optional<Organization>
}
