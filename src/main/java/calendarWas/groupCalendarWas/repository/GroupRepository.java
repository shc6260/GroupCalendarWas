package calendarWas.groupCalendarWas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import calendarWas.groupCalendarWas.domain.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
