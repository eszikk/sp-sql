package com.example.oraclestatuspagev2.persistent.repository;

import com.example.oraclestatuspagev2.persistent.entity.TagEntity;
import com.example.oraclestatuspagev2.persistent.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
