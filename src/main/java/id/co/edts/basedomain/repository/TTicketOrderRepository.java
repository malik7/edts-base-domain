package id.co.edts.basedomain.repository;

import id.co.edts.basedomain.model.TTicketOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TTicketOrderRepository extends JpaRepository<TTicketOrder, Long> {
    Optional<TTicketOrder> findByReceiptNo(String receiptNo);
    Optional<TTicketOrder> findByMasterCustomerIdAndMasterTicketId(Long customerId, Long ticketId);
}
