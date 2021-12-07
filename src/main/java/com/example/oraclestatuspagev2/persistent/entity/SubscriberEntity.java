package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "SUBSCRIBER", schema = "CNE_STATUSPAGE", catalog = "")
public class SubscriberEntity extends BaseEntity {
    @Column
    private String email;
    @Column
    private String verifyCode;
}
