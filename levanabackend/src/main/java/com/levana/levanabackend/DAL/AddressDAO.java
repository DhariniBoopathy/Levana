package com.levana.levanabackend.DAL;



	import java.util.List;

import com.levana.levanabackend.Model.Address;

	

public interface AddressDAO {
	 boolean CreateAddress(Address address);
	 boolean UpdateAddress(Address address);
	 boolean DeleteAddress(int id);
	 Address SelectoneAddress(int addressid);
	 List<Address> SelectallAddress(int cartid);

	}
