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
import com.vijay.cart.model.Product;

@Controller
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(CartController.class);
	
	//Map to store Orders, ideally we should use database
	Map<Integer, Product> productsData = new HashMap<Integer, Product>();
	@RequestMapping(value = CartRestURIRestConstants.ADD_PRODUCT, method = RequestMethod.POST)
	public @ResponseBody Product createProduct(@RequestBody Product product) {
		logger.info("Start creating product");
		productsData.put(product.getProductId(),product);
		return product;
	}
	@RequestMapping(value = CartRestURIRestConstants.GET_PRODUCT, method = RequestMethod.GET)
	public @ResponseBody Product getOrder(@PathVariable("id") int proid) {
		logger.info("Start getDummyEmployee");
		Product pro = new Product();
		pro=productsData.get(proid);
		return pro;
	}
	
		
}
