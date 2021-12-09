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
@Table(name = "SUBSCRIBER")
@SQLDelete(sql = "UPDATE SUBSCRIBER SET deleted_at = CURRENT_TIMESTAMP(6) WHERE id=?")
@Where(clause = "deleted_at IS NULL")
public class SubscriberEntity extends BaseEntity {
    @Column
    private String email;
    @Column
    private String verifyCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubscriberEntity)) return false;
        if (!super.equals(o)) return false;

        SubscriberEntity that = (SubscriberEntity) o;
        return that.getId().equals(((SubscriberEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
