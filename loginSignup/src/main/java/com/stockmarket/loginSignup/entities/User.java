package com.stockmarket.loginSignup.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
    private String username;
    private String password;
//    private Integer contact_id;
    private String user_type;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contact_id")
    private Contact contact;
    
    public User() {}
    public User(Integer id, String username, String password, String user_type, Contact contact, int confirmed) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.user_type = user_type;
		this.contact = contact;
		this.confirmed = confirmed;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public Integer getContact_id() {
//		return contact_id;
//	}
//
//	public void setContact_id(Integer contact_id) {
//		this.contact_id = contact_id;
//	}
	
	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	@Column(nullable=false)
    private int confirmed;
    
}