package calendarWas.groupCalendarWas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import calendarWas.groupCalendarWas.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
