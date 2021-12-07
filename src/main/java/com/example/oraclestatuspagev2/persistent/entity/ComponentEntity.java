package com.example.oraclestatuspagev2.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "COMPONENT", schema = "CNE_STATUSPAGE", catalog = "")
public class ComponentEntity extends BaseEntity {

    @Column
    private String name;
    @Column
    private String description;
    @Column
    private int status;
    @Column
    private Integer order;
    @Column
    private boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "COMPONENT_SCHEDULED_MAINTENANCE",
            joinColumns = @JoinColumn(name = "COMPONENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "SCHEDULED_MAINTENANCE_ID"))
    private Set<ScheduledMaintenanceEntity> scheduledMaintenances;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "COMPONENT_INCIDENT",
            joinColumns = @JoinColumn(name = "COMPONENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "INCIDENT_ID"))
    private Set<IncidentEntity> incidents;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "COMPONENT_SUBSCRIBER",
            joinColumns = @JoinColumn(name = "COMPONENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "SUBSCRIBER_ID"))
    private Set<SubscriberEntity> subscribers;


}
