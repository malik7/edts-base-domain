package id.co.edts.basedomain.model;

import id.co.edts.apicore.annotation.entity.EnableFilter;
import id.co.edts.apicore.annotation.entity.EnableGlobalFilter;
import id.co.edts.apicore.annotation.entity.EnableSort;
import id.co.edts.apicore.annotation.entity.IgnoreMetadata;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MASTER_CONCERT")
public class MasterConcert extends BaseDomain {

    @Id
    @IgnoreMetadata
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @EnableFilter
    @EnableSort
    @EnableGlobalFilter
    @Column(name = "NAME")
    private String name;

    @EnableFilter
    @EnableSort
    @EnableGlobalFilter
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE")
    private Date date;

    @EnableFilter
    @EnableSort
    @EnableGlobalFilter
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "VENUE_ID", referencedColumnName = "id")
    private MasterVenue masterVenue;
}
