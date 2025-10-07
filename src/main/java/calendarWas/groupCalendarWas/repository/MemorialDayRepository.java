package calendarWas.groupCalendarWas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import calendarWas.groupCalendarWas.domain.MemorialDay;

public interface MemorialDayRepository extends JpaRepository<MemorialDay, Long> {
}
