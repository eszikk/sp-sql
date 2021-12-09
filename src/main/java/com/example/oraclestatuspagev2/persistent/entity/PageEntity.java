package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Getter
@Setter
@Entity
@Table(name = "PAGE")
@SQLDelete(sql = "UPDATE PAGE SET deleted_at = CURRENT_TIMESTAMP(6) WHERE id=?")
@Where(clause = "deleted_at IS NULL")
public class PageEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String accessType;
    @Column
    private String audience;
    @Column
    private boolean published;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private ProjectEntity project;

    @ManyToMany(mappedBy = "pages")
    private Set<UserEntity> users;

    @OneToMany(cascade = ALL, orphanRemoval = true)
    @JoinColumn(name = "page_id", nullable = false)
    private Set<ComponentEntity> components;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PageEntity)) return false;
        if (!super.equals(o)) return false;

        PageEntity that = (PageEntity) o;
        return that.getId().equals(((PageEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
