package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "TAG")
@SQLDelete(sql = "UPDATE TAG SET deleted_at = CURRENT_TIMESTAMP(6) WHERE id=?")
@Where(clause = "deleted_at IS NULL")
public class TagEntity extends BaseEntity {
    @NaturalId
    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String slug;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TagEntity)) return false;
        if (!super.equals(o)) return false;

        TagEntity that = (TagEntity) o;
        return that.getId().equals(((TagEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
