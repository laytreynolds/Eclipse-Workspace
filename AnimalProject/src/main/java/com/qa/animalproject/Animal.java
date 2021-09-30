package com.qa.animalproject;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String type;
	private int jumpheight;

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

	public int getJumpheight() {
		return jumpheight;
	}

	public void setJumpheight(int jumpheight) {
		this.jumpheight = jumpheight;
	}

	public Animal(long id, String firstName, String lastName, String type, int jumpheight) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.jumpheight = jumpheight;
	}

	public Animal(String firstName, String lastName, String type, int jumpheight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.jumpheight = jumpheight;
	}

	public Animal(String firstName, String lastName) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;

	}

	public Animal() {
		super();

	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", type=" + type
				+ ", jumpheight=" + jumpheight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, jumpheight, lastName, type);
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
		return Objects.equals(firstName, other.firstName) && id == other.id && jumpheight == other.jumpheight
				&& Objects.equals(lastName, other.lastName) && Objects.equals(type, other.type);
	}

}