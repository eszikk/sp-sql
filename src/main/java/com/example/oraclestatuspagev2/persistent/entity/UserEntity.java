package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "APP_USER")
@SQLDelete(sql = "UPDATE APP_USER SET deleted_at = CURRENT_TIMESTAMP(6) WHERE id=?")
@Where(clause = "deleted_at IS NULL")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        if (!super.equals(o)) return false;

        UserEntity that = (UserEntity) o;
        return that.getId().equals(((UserEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
