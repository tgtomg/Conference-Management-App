package repository;

import entity.Conference;
import entity.Ticket;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, String> {

    List<Ticket> findByUser(User user);

    List<Ticket> findByConference(Conference conference);

    Optional<Ticket> findByUserAndConference(User user, Conference conference);

    long countByConference(Conference conference);

}
