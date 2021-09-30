package com.qa.animal;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String type;
	
	@Column
	private int legs;

	
	public Animal() {
		super();
	}
	
	public Animal(long id, String firstName, String lastName, String type, int legs) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.legs = legs;
	}
	
	public Animal(String firstName, String lastName, String type, int legs) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.legs = legs;
	}
	
	public Animal(String firstName, String lastName) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
		
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getlegs() {
		return legs;
	}

	public void setlegs(int legs) {
		this.legs = legs;
	}


	@Override
	public String toString() {
		return "Animals [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", type=" + type
				+ ", legs=" + legs + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, legs, lastName, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && legs == other.legs
				&& Objects.equals(lastName, other.lastName) && Objects.equals(type, other.type);
	}

}
