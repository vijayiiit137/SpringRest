package com.vijay.cart.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.vijay.cart.model.Orders;

@Controller
public class CartController {
	
	private int orderid=1;
	private static final Logger logger = LoggerFactory.getLogger(CartController.class);
	
	//Map to store Orders, ideally we should use database
	Map<Integer, Orders> ordersdata = new HashMap<Integer, Orders>();
	
	@RequestMapping(value = CartRestURIRestConstants.CREATE_ORDER, method = RequestMethod.POST)
	public @ResponseBody Orders createOrder(@RequestBody Orders ord) {
		logger.info("Start creating order");
		ord.setOrderId(orderid);
		ordersdata.put(orderid,ord);
		orderid++;
		return ord;
	}
	@RequestMapping(value = CartRestURIRestConstants.GET_ORDER, method = RequestMethod.GET)
	public @ResponseBody Orders getOrder(@PathVariable("id") int ordid) {
		logger.info("Start getDummyEmployee");
		Orders order = new Orders();
		order=ordersdata.get(ordid);
		return order;
	}
	
		
}
