package com.studio.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Studio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fullname;
	private String email;
	private String password;
	private String confirm_password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	@Override
	public String toString() {
		return "Studio [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password
				+ ", confirm_password=" + confirm_password + "]";
	}
	public Studio(Long id, String fullname, String email, String password, String confirm_password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.confirm_password = confirm_password;
	}
	public Studio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}