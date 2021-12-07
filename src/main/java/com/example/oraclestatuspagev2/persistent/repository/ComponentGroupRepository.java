package com.example.oraclestatuspagev2.persistent.repository;

import com.example.oraclestatuspagev2.persistent.entity.ComponentEntity;
import com.example.oraclestatuspagev2.persistent.entity.ComponentGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComponentGroupRepository extends JpaRepository<ComponentGroupEntity, Long> {
}
