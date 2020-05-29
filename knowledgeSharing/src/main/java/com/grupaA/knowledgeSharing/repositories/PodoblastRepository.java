package com.grupaA.knowledgeSharing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.grupaA.knowledgeSharing.model.Podoblast;
@Repository

public interface PodoblastRepository extends JpaRepository<Podoblast, Long> {

}