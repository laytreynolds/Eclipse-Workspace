package com.qa.animal;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

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

	private AnimalService service;
	
	
	List<Animal> animalList = new ArrayList<>();
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello world";
	}
	
	
	public AnimalController(AnimalService service) {
		super();
		this.service = service;
	}
	
    @PostMapping("/create")
    public Animal addAnimal(@RequestBody Animal Animal) {
        return this.service.addAnimal(Animal);
    }

    @GetMapping("/getAll")
    public List<Animal> getAllanimal() {
        return this.service.getAllanimal();
    }

    @PutMapping("/update")
    public Animal updateAnimal(@PathParam("id") int id, @RequestBody Animal Animal) {
        return this.service.updateAnimal(id, Animal);
    }

    @DeleteMapping("/delete/{id}")
    public Animal removeAnimal(@PathVariable int id) {
        return this.service.removeAnimal(id);
    }
	
    
    @PostMapping("/createStatic") 
	public Animal createStatic(@RequestBody Animal a) {
	return new Animal(a.getfirstName(),a.getlastName());
    }
    
    
    
    @PostMapping("/create")
	public ResponseEntity<Animal> create(@RequestBody Animal a) {
		return this.animalList.add(a) ? new ResponseEntity<>(HttpStatus.CREATED) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping(".delete/{id}")
	public ResponseEntity<Boolean> deleteAnimals(@PathVariable long id) {
		return this.animalList.remove(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR)
				;
	}
	@GetMapping("/readAll")
	public ResponseEntity<List<Animal>> readAll() {
		return ResponseEntity.ok(this.animalList);
	}
    
    
    
	
	}

