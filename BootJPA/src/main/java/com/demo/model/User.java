package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_data")
public class User {

	@Id
	private int id;
	private String name;
	private String address;
	private long contact;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String address, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}

}
