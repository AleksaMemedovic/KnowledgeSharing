package com.grupaA.knowledgeSharing.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupaA.knowledgeSharing.model.Korisnik;
@Repository
public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {

}