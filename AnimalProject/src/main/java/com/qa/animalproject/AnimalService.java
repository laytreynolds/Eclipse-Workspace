package com.qa.animalproject;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

	private ModelMapper mapper;
	private AnimalRepo repo;

	@Autowired
	public AnimalService(AnimalRepo repo, ModelMapper mapper) {
		this.repo = repo;
		this.mapper = mapper;
	}

	public AnimalDTO mapToDTO(Animal a) {
		return this.mapper.map(a, AnimalDTO.class);

	}

	public Animal mapFromDTO(AnimalDTO a) {
		return this.mapper.map(a, Animal.class);
	}

	public AnimalService(AnimalRepo repo) {
		this.repo = repo;
	}

//create 
	public AnimalDTO create(AnimalDTO a) {
		Animal saveIt = this.mapFromDTO(a);
		Animal saved = this.repo.save(saveIt);
		return this.mapToDTO(saved);
	}

//ReadAll

	public List<Animal> readAll() {
		return this.repo.findAll();
	}

//Read id

	public Animal read(long id) {
		return this.repo.findById(id).get();
	}

//update 
	public Animal update(Animal a, long id) {
		Animal exists = this.repo.findById(id).orElseThrow(AnimalNotFoundException::new);
		exists.setfirstName(a.getfirstName());
		exists.setfirstName(a.getfirstName());
		return this.repo.saveAndFlush(exists);

	}

//delete
	public boolean delete(long id) {
		if (!this.repo.existsById(id)) {
			throw new AnimalNotFoundException();
		}
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

//FindbyId
	public List<Animal> findByName(String name) {
		return this.repo.findByname(name);
	}

}