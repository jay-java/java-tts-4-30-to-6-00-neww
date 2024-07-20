package com.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_data")
public class Model {
	@Id
	@Column(name="user_id")
	private int id;
	private String name;
	private long contact;
	private String address;
	
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(int id, String name, long contact, String address) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	
}
