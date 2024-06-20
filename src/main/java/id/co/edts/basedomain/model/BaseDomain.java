package id.co.edts.basedomain.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseDomain {

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate;

    @Column(name = "CREATED_BY", length = 50, nullable = true)
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "MODIFIED_DATE", nullable = true)
    private Date modifiedDate;

    @Column(name = "MODIFIED_BY", length = 50, nullable = true)
    private String modifiedBy;

    @Column(name = "IS_DELETED", nullable = false)
    private Boolean isDeleted = false;

    @PrePersist
    public void onCreate(){
        if (null == this.createdDate){
            this.createdDate = new Date();
        }
        if (null == this.createdBy){
            this.createdBy = "SYSTEM";
        }
    }

    @PreUpdate
    public void onUpdate(){
        if (null == this.modifiedDate){
            this.modifiedDate = new Date();
        }
        if (null == this.createdBy){
            this.modifiedBy = "SYSTEM";
        }
    }
}
