package com.grupaA.knowledgeSharing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grupaA.knowledgeSharing.model.Korisnik;
import com.grupaA.knowledgeSharing.repositories.KorisnikRepository;
import com.grupaA.knowledgeSharing.services.JezikService;
import com.grupaA.knowledgeSharing.services.KorisnikService;

@RestController
class KorisnikController {
	@Autowired
	   private KorisnikService korisnikService;
	   

  // Aggregate root

  @GetMapping("/korisnici")
  List<Korisnik> all() {
    return this.korisnikService.findAll();
  }
}
  