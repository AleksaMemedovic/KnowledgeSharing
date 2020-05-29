package com.grupaA.knowledgeSharing.controllers;
import com.grupaA.knowledgeSharing.model.Podoblast;
import java.util.List;
import com.grupaA.knowledgeSharing.services.JezikService;
import com.grupaA.knowledgeSharing.services.PodoblastService;

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
class PodoblastController {

   @Autowired
   private PodoblastService podoblastService;
   
   
  // Aggregate root
   @GetMapping("/podoblasti")
   List<Podoblast> all() {
     return this.podoblastService.findAll();
   }
}