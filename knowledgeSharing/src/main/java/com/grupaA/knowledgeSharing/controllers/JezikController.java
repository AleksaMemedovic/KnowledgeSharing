package com.grupaA.knowledgeSharing.controllers;
import com.grupaA.knowledgeSharing.model.Jezik;
import java.util.List;
import com.grupaA.knowledgeSharing.services.JezikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
class JezikController {

   @Autowired
   private JezikService jezikService;
   
   
  // Aggregate root
   @GetMapping("/jezici")
   List<Jezik> all() {
     return this.jezikService.findAll();
   }
}