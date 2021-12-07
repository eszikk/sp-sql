package com.example.oraclestatuspagev2.persistent.repository;

import com.example.oraclestatuspagev2.persistent.entity.EntitlementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntitlementRepository extends JpaRepository<EntitlementEntity, Long> {
}
