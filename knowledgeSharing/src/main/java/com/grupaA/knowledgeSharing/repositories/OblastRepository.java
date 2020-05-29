package com.grupaA.knowledgeSharing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupaA.knowledgeSharing.model.Oblast;
@Repository

public interface OblastRepository extends JpaRepository<Oblast, Long> {

}