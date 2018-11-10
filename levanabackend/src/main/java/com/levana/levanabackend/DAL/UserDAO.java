package com.levana.levanabackend.DAL;

import com.levana.levanabackend.Model.User;

public interface UserDAO {
		boolean CreateUserDetails(User userdetails);
		boolean UpdateUserDetails(User userdetails);
		boolean DeleteUserDetails(User userdetails);
		User SelectUser(String Emailid);


}
