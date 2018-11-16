package com.levana.levanabackend.DAL;

import com.levana.levanabackend.Model.UserDetails;

public interface UserDAO {
		boolean CreateUserDetails(UserDetails userdetails);
		boolean UpdateUserDetails(UserDetails userdetails);
		boolean DeleteUserDetails(UserDetails userdetails);
		UserDetails SelectUser(String Emailid);


}
