package calendarWas.groupCalendarWas.repository;

import calendarWas.groupCalendarWas.domain.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}
