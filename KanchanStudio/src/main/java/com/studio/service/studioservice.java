package com.studio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studio.entity.Login;
import com.studio.entity.Studio;
import com.studio.repository.studioRepo;

@Service
public class studioservice {
	@Autowired
	private studioRepo repo;

	public void savePerson(Studio studio) {
		repo.save(studio);
	}

	public List<Studio> getAllDataofRegisteredMember() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public List<Studio> getAllLoginData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public boolean Shubham(Login login) {
		Studio studio = repo.findByEmail(login.getEmail());
		if (studio == null) {
			return false;
		} else {
			if (login.getPassword().equals(studio.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}

}
