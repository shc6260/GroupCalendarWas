package calendarWas.groupCalendarWas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import calendarWas.groupCalendarWas.domain.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
