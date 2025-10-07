package calendarWas.groupCalendarWas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import calendarWas.groupCalendarWas.domain.Day;

public interface DayRepository extends JpaRepository<Day, Long> {
}
