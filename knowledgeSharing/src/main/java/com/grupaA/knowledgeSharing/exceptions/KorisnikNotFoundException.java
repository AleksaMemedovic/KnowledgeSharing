package com.grupaA.knowledgeSharing.exceptions;


public class KorisnikNotFoundException extends RuntimeException {

  public KorisnikNotFoundException(Long id) {
    super("Could not find korisnik " + id);
  }
}