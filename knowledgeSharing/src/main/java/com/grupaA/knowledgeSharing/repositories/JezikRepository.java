package com.grupaA.knowledgeSharing.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.grupaA.knowledgeSharing.model.Jezik;
@Repository
public interface JezikRepository extends JpaRepository<Jezik, Long> {

}