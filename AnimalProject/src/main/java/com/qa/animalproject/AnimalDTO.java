package com.qa.animalproject;

public class AnimalDTO {

	private long id;
	public String firstName;
	public String lastName;
	public int jumpheight;
	
	public AnimalDTO(Animal a) {
		this.id = a.getId();
		this.firstName = a.getfirstName();
		this.lastName = a.getlastName();
		this.jumpheight	= a.getJumpheight();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getJumpheight() {
		return jumpheight;
	}
	public void setJumpheight(int jumpheight) {
		this.jumpheight = jumpheight;
	}
	
	
	
	
	
	
}
