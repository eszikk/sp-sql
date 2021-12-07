package com.example.oraclestatuspagev2.persistent.repository;

import com.example.oraclestatuspagev2.persistent.entity.SubscriberEntity;
import com.example.oraclestatuspagev2.persistent.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TagRepository extends JpaRepository<TagEntity, Long> {
}
