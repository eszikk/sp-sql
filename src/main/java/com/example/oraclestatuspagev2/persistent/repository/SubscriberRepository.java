package com.example.oraclestatuspagev2.persistent.repository;

import com.example.oraclestatuspagev2.persistent.entity.ProjectEntity;
import com.example.oraclestatuspagev2.persistent.entity.SubscriberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<SubscriberEntity, Long> {
}
