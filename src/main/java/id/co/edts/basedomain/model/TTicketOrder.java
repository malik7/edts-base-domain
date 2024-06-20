package id.co.edts.basedomain.model;

import id.co.edts.apicore.annotation.entity.IgnoreMetadata;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_TICKET_ORDER")
public class TTicketOrder extends BaseDomain {
    @Id
    @IgnoreMetadata
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*@Column(name = "CUSTOMER_ID")
    private Long customerId;*/

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "id")
    private MasterCustomer masterCustomer;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "TICKET_ID", referencedColumnName = "id")
    private MasterTicket masterTicket;

    /*@Column(name = "TICKET_ID")
    private Long ticketId;*/

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ORDER_TIME")
    private Date orderTime;

    @Column(name = "NUMBER_OF_TICKET")
    private Integer numberOfTicket;

    @Column(name = "TOTAL_PRICE")
    private BigDecimal totalPrice;

    @Column(name = "ORDER_STATUS")
    private String orderStatus;

    @Column(name = "RECEIPT_NO")
    private String receiptNo;
}
