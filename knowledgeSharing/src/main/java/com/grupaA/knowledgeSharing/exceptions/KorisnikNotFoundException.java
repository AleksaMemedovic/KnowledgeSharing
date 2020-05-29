package com.grupaA.knowledgeSharing.exceptions;


class KorisnikNotFoundException extends RuntimeException {

  EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}