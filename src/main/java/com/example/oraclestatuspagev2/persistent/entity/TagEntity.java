package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "TAG", schema = "CNE_STATUSPAGE", catalog = "")
public class TagEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private String slug;
}
