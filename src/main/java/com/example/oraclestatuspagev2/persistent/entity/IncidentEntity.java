package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "INCIDENT")
@SQLDelete(sql = "UPDATE INCIDENT SET deleted_at = CURRENT_TIMESTAMP(6) WHERE id=?")
@Where(clause = "deleted_at IS NULL")
public class IncidentEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private int status;
    @Lob
    @Column
    private String message;
    @Column
    private boolean visible;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IncidentEntity)) return false;
        if (!super.equals(o)) return false;

        IncidentEntity that = (IncidentEntity) o;
        return that.getId().equals(((IncidentEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
