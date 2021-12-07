package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "APP_USER", schema = "CNE_STATUSPAGE", catalog = "")
public class UserEntity extends BaseEntity {
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String rememberToken;
    @Column
    private String email;
    @Column
    private String apiKey;
    @Column
    private boolean active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "APP_USER_ENTITLEMENT",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ENTITLEMENT_ID"))
    private Set<EntitlementEntity> entitlements;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "APP_USER_PAGE",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PAGE_ID"))
    private Set<PageEntity> pages;
}
