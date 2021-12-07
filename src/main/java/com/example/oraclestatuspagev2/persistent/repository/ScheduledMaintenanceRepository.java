package com.example.oraclestatuspagev2.persistent.repository;

import com.example.oraclestatuspagev2.persistent.entity.ScheduledMaintenanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduledMaintenanceRepository extends JpaRepository<ScheduledMaintenanceEntity, Long> {
}
