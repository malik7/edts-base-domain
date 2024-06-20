package id.co.edts.basedomain.repository;

import id.co.edts.basedomain.model.MasterTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<MasterTicket, Long> {
    Optional<List<MasterTicket>> findAllByMasterConcertId(Long concertId);
}
