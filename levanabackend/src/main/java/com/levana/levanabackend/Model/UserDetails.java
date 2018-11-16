package com.levana.levanabackend.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cart_id;

	@Column(nullable = false)
	@NotBlank(message = "user name is mandatory")
	private String user_name;
	
	@Column(nullable = false, unique = true)
	//@Email(regexp="[a-z0-9_]+@[a-z]+\\.[a-z]{2,3}",message="please enter a valid email id")
	private String emailid;

	@Column(nullable = false)
	@Size(min = 10, max = 10)
	@Pattern(regexp="[9876][0-9]{9}", message="must start with either 9/8/7/6 and have 10 numbers")
	private String phoneno;

	@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}", message="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters")
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	

	
	
	

}