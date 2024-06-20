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
@Table(name = "MASTER_TICKET")
public class MasterTicket extends BaseDomain{
    @Id
    @IgnoreMetadata
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*@Column(name = "CONCERT_ID")
    private Long concertId;*/

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PURCHASE_START_DATE")
    private Date purchaseStartDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PURCHASE_END_DATE")
    private Date purchaseEndDate;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "TICKET_NUMBER_LIMIT")
    private Integer ticketNumberLimit;

    @Column(name = "TICKET_NUMBER_SOLD")
    private Integer ticketNumberSold;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "concert_id", referencedColumnName = "id")
    private MasterConcert masterConcert;
}
