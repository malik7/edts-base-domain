package id.co.edts.basedomain.repository;

import id.co.edts.basedomain.model.MasterCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<MasterCustomer, Long> {
    Optional<MasterCustomer> findByEmailOrPhoneNumber(String email, String phoneNumber);
}
