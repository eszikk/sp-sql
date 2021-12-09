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
@Table(name = "PROJECT")
@NamedEntityGraph(
        name = "project-entity-graph",
        attributeNodes = {
                @NamedAttributeNode("statusPages")
        }
)
@SQLDelete(sql = "UPDATE PROJECT SET deleted_at = CURRENT_TIMESTAMP(6) WHERE id=?")
@Where(clause = "deleted_at IS NULL")
public class ProjectEntity extends BaseEntity {
    @Column
    private String name;

    @Column
    private String description;

    @OneToMany(mappedBy = "project")
    private Set<PageEntity> statusPages;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectEntity)) return false;
        if (!super.equals(o)) return false;

        ProjectEntity that = (ProjectEntity) o;
        return that.getId().equals(((ProjectEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
