package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Getter
@Setter
@Entity
@Table(name = "PAGE", schema = "CNE_STATUSPAGE", catalog = "")
public class PageEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String accessType;
    @Column
    private String audience;
    @Column
    private boolean published;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private ProjectEntity project;

    @ManyToMany(mappedBy = "pages")
    private Set<UserEntity> users;

    @OneToMany(cascade = ALL, orphanRemoval = true)
    @JoinColumn(name = "page_id", nullable = false)
    private Set<ComponentEntity> components;

}
