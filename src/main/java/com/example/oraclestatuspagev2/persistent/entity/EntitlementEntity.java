package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ENTITLEMENT")
@SQLDelete(sql = "UPDATE ENTITLEMENT SET deleted_at = CURRENT_TIMESTAMP(6) WHERE id=?")
@Where(clause = "deleted_at IS NULL")
public class EntitlementEntity extends BaseEntity {
    @Column
    private String name;

    @ManyToMany(mappedBy = "entitlements")
    private Set<UserEntity> users;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntitlementEntity)) return false;
        if (!super.equals(o)) return false;

        EntitlementEntity that = (EntitlementEntity) o;
        return that.getId().equals(((EntitlementEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
