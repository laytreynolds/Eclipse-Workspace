package com.qa.animalproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	private AnimalService service;
	

//create
	@PostMapping("/create")
	public ResponseEntity<Animal> create(@RequestBody Animal a) {
		return new ResponseEntity<Animal>(this.service.create(a), HttpStatus.CREATED);
	}
	
//create via DTO
	@PostMapping("/createDTO")
	public ResponseEntity<AnimalDTO> createByDTO(@RequestBody AnimalDTO a) {
		return new ResponseEntity<AnimalDTO>(this.service.createByDTO(a), HttpStatus.CREATED);
	}

//ReadAllByDTO
	@GetMapping("/readDTO")
	public ResponseEntity<List<AnimalDTO>> readAllByDTO() {
		return new ResponseEntity<List<AnimalDTO>>(this.service.readAllbyDTO(), HttpStatus.OK);
		
	}
//Read
	@GetMapping("/read")
	public ResponseEntity<List<Animal>> readAll() {
		return new ResponseEntity<List<Animal>>(this.service.readAll(), HttpStatus.OK);

	}

//ReadId
	@GetMapping("/read/{id}")
	public ResponseEntity<Animal> read(@PathVariable long id) {
		return new ResponseEntity<Animal>(this.service.read(id), HttpStatus.OK);

	}

//FindByName
	
	@GetMapping("/readname/{name}")
	public ResponseEntity<List<Animal>> findByName(@PathVariable String name) {
		return new ResponseEntity<List<Animal>>(this.service.findByName(name), HttpStatus.OK);
		
	}
	
//Update
	@PutMapping("/update/{id}")
	public ResponseEntity<Animal> update(@PathVariable long id, @RequestBody Animal a) {
		return new ResponseEntity<Animal>(this.service.update(id, a), HttpStatus.ACCEPTED);

	}

//delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
	}
}
