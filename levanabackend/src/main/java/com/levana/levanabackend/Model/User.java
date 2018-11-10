package com.levana.levanabackend.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "customer")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cart_id;

	@Column(nullable = false)
	@NotBlank(message = "user name is mandatory")
	private String user_name;
	
	@Column(nullable = false, unique = true)
	@Email(regexp = "[a-z0-9-]+@[gmail||yahoo]+\\.[com||org||in]", message = "not a valid id")
	private String emailid;

	@Column(nullable = false)
	@Pattern(regexp = "[6789][0-9]{9}", message = "not a valid no")
	private String phoneno;

	@Column(nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9@#$]{8,16}", message = "Passwod minimum 8 char max 16 char")
	@Transient
	private String u_password;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		emailid = emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	
	
	

}