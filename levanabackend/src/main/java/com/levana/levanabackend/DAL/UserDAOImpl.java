package com.levana.levanabackend.DAL;
import com.levana.levanabackend.Model.UserDetails;
import com.levana.levanabackend.Model.UserCred;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionfactory;

	public boolean CreateUserDetails(UserDetails userdetails) {

		try
		{
		UserCred c=new UserCred();
		c.setEmailid(userdetails.getEmailid());
		c.setUser_Password(userdetails.getU_password());
		c.setStatus("True");
		c.setRole("ROLE_USER");
		sessionfactory.getCurrentSession().save(userdetails);
		sessionfactory.getCurrentSession().save(c);		
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	public boolean UpdateUserDetails(UserDetails userdetails) 
	{
		try
		{
		sessionfactory.getCurrentSession().update(userdetails);
		return true;
		}
		catch (Exception e)
		{
			return false;
		}
		
	}

	public boolean DeleteUserDetails(UserDetails userdetails) 
	{
		try
		{
			sessionfactory.getCurrentSession().delete(userdetails);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}

	public UserDetails SelectUser(String emailid) {
		try {
			return (UserDetails) sessionfactory.getCurrentSession()
					.createQuery("from UserDetails where Emailid='" + emailid + "'").uniqueResult();
		}

		catch (Exception e) {
			return null;
		}
	}

}


