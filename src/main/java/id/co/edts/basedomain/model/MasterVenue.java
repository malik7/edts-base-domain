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
@Table(name = "MASTER_VENUE")
public class MasterVenue extends BaseDomain {
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
    @Column(name = "LOCATION")
    private String location;

    @Column(name = "CAPACITY")
    private Long capacity;
}
