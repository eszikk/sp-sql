package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    protected Long id;

    @Column
    protected ZonedDateTime createdAt;
    @Column
    protected ZonedDateTime updatedAt;
    @Column
    protected ZonedDateTime deletedAt;
}
