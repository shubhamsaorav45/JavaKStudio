package com.studio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studio.entity.Studio;
@Repository
public interface studioRepo extends JpaRepository<Studio, Long > {
	Studio findByEmail(String email);
    
}
