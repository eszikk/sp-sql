package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "PROJECT", schema = "CNE_STATUSPAGE", catalog = "")
@NamedEntityGraph(
        name = "project-entity-graph",
        attributeNodes = {
                @NamedAttributeNode("pages")
        }
)
public class ProjectEntity extends BaseEntity {
    @Column
    private String name;

    @Column
    private String description;

    @OneToMany(mappedBy = "project")
    private Set<PageEntity> pages;
}
