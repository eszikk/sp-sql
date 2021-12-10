package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.ZonedDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    protected Long id;

    @Column
    @CreationTimestamp
    protected ZonedDateTime createdAt;

    @Column
    @UpdateTimestamp
    protected ZonedDateTime updatedAt;

    @Column
    protected ZonedDateTime deletedAt;

    @Version
    protected Long version;
}
