package com.grupaA.knowledgeSharing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupaA.knowledgeSharing.model.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {

}