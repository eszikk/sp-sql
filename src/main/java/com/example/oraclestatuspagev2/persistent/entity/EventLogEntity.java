package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import java.time.ZonedDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "EVENT_LOG")
public class EventLogEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    protected Long id;

    @Enumerated(EnumType.STRING)
    private DbOperation operation;

    @Enumerated(EnumType.STRING)
    private TableName tableName;

    @Lob
    @Column
    private String before;

    @Lob
    @Column
    private String after;

    @Column
    @CreationTimestamp
    protected ZonedDateTime createdAt;
}

enum DbOperation {
    CREATE,
    UPDATE,
    DELETE
}

enum TableName {
    APP_USER,
    PROJECT,
    SUBSCRIBER,
    COMPONENT,
    COMPONENT_GROUP,
    COMPONENT_TAG
}
