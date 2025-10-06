package repository;

import entity.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, String> {

    List<Conference> findByOrganizer(String organizer);

    List<Conference> findByTitleContainingIgnoreCase(String keyword);

}
