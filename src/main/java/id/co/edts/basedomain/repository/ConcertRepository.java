package id.co.edts.basedomain.repository;

import id.co.edts.basedomain.model.MasterConcert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcertRepository extends JpaRepository<MasterConcert, Long>, JpaSpecificationExecutor<MasterConcert> {
}
