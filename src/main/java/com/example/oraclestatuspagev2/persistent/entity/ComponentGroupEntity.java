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
@Table(name = "COMPONENT_GROUP")
@SQLDelete(sql = "UPDATE COMPONENT_GROUP SET deleted_at = CURRENT_TIMESTAMP(6) WHERE id=?")
@Where(clause = "deleted_at IS NULL")
public class ComponentGroupEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private int order;
    @Column
    private boolean collapsed;

    @ManyToMany(mappedBy = "componentGroups")
    private Set<ComponentEntity> components;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComponentEntity)) return false;
        if (!super.equals(o)) return false;

        ComponentGroupEntity that = (ComponentGroupEntity) o;
        return that.getId().equals(((ComponentGroupEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
