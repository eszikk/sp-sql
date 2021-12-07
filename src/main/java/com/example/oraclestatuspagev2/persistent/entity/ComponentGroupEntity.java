package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "COMPONENT_GROUP", schema = "CNE_STATUSPAGE", catalog = "")
public class ComponentGroupEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private int order;
    @Column
    private boolean collapsed;
}
