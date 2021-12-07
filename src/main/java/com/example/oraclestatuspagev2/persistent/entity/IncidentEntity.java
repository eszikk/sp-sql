package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "INCIDENT", schema = "CNE_STATUSPAGE", catalog = "")
public class IncidentEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private int status;
    @Lob
    @Column
    private String message;
    @Column
    private boolean visible;
}
