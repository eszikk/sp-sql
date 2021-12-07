package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ENTITLEMENT", schema = "CNE_STATUSPAGE", catalog = "")
public class EntitlementEntity extends BaseEntity {
    @Column
    private String name;

    @ManyToMany(mappedBy = "entitlements")
    private Set<UserEntity> users;
}
