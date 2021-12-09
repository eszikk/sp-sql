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
@Table(name = "COMPONENT")
@SQLDelete(sql = "UPDATE COMPONENT SET deleted_at = CURRENT_TIMESTAMP(6) WHERE id=?")
@Where(clause = "deleted_at IS NULL")
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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "COMPONENT_COMPONENT_GROUP",
            joinColumns = @JoinColumn(name = "COMPONENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "COMPONENT_GROUP_ID"))
    private Set<ComponentGroupEntity> componentGroups;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComponentEntity)) return false;
        if (!super.equals(o)) return false;

        ComponentEntity that = (ComponentEntity) o;
        return that.getId().equals(((ComponentEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
