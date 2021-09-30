package com.qa.animal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnimalService {
		
	List<Animal> animal = new ArrayList<>();

	    public Animal addAnimal(Animal Animal) {
	        // Add new Animal
	        this.animal.add(Animal);
	        // Return last added Animal from List
	        return this.animal.get(this.animal.size() - 1);
	    }

	    public List<Animal> getAllanimal() {
	        // Return the whole List
	        return this.animal;
	    }

	    public Animal updateAnimal(int id, Animal Animal) {
	        // Remove existing Animal with matching 'id'
	        this.animal.remove(id);
	        // Add new Animal in its place
	        this.animal.add(id, Animal);
	        // Return updated Animal from List
	        return this.animal.get(id);
	    }

	    public Animal removeAnimal(int id) {
	        // Remove Animal and return it
	        return this.animal.remove(id);
	    }

}
	
	
	


