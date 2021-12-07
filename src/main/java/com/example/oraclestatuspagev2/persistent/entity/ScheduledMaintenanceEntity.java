package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "SCHEDULED_MAINTENANCE", schema = "CNE_STATUSPAGE", catalog = "")
public class ScheduledMaintenanceEntity extends BaseEntity {

    @Column
    private String name;
    @Column
    private int status;
    @Lob
    @Column
    private String message;
    @Column
    private Timestamp scheduledAt;
    @Column
    private boolean visible;

}
