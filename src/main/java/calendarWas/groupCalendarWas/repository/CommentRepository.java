package calendarWas.groupCalendarWas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import calendarWas.groupCalendarWas.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
