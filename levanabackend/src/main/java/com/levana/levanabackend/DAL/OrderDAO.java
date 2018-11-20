package com.levana.levanabackend.DAL;

import java.util.List;

import com.levana.levanabackend.Model.MyOrder;

public interface OrderDAO {
 boolean Placeorder(MyOrder order);
 List<MyOrder> ViewOrder(int cartid); 
 MyOrder Showorder(String orderid);
}
