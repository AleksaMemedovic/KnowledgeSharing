package com.grupaA.knowledgeSharing.services;
import com.grupaA.knowledgeSharing.model.Jezik;
import com.grupaA.knowledgeSharing.repositories.JezikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JezikService implements IJezikService{

    @Autowired
    private JezikRepository jezikRepository;

    @Override
    public Optional<Jezik> findById(Long id) {

        return jezikRepository.findById(id);
    }
public List<Jezik> findAll() {
		
		return this.jezikRepository.findAll();
	}
}