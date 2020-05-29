package com.grupaA.knowledgeSharing.controllers;
import com.grupaA.knowledgeSharing.model.Korisnik;
import com.grupaA.knowledgeSharing.repositories.KorisnikRepository;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class KorisnikController {

  private final KorisnikRepository repository;

   KorisnikController(KorisnikRepository repository) {
    this.repository = repository;
  }

  // Aggregate root

  @GetMapping("/employees")
  List<Korisnik> all() {
    return repository.findAll();
  }

  @PostMapping("/employees")
  Korisnik newEmployee(@RequestBody Korisnik newKorisnik) {
    return repository.save(newKorisnik);
  }

  // Single item

  @GetMapping("/korisniks/{id}")
  Korisnik one(@PathVariable Long id) {

    return repository.findById(id)
      .orElseThrow(() -> new KorisnikNotFoundException(id));
  }

  @PutMapping("/employees/{id}")
  Korisnik replaceKorisnik(@RequestBody Korisnik newKorisnik, @PathVariable Long id) {

    return repository.findById(id)
      .map(employee -> {
        employee.setIme(newKorisnik.getIme());
        employee.setAdminStatus(newKorisnik.getAdminStatus());
        return repository.save(employee);
      })
      .orElseGet(() -> {
        newKorisnik.setKorisnikId(id);
        return repository.save(newKorisnik);
      });
  }

  @DeleteMapping("/korisniks/{id}")
  void deleteKorisnik(@PathVariable Long id) {
    repository.deleteById(id);
  }
}