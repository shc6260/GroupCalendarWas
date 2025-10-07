package calendarWas.groupCalendarWas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import calendarWas.groupCalendarWas.domain.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
