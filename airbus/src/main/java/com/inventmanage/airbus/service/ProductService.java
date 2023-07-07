package com.inventmanage.airbus.service;

import java.util.List;

import com.inventmanage.airbus.exception.*;
import com.inventmanage.airbus.model.*;

public interface ProductService {
	
	public List<Product> getAllProducts();
	public List<Product> getProductsByCategory(String categoryName);
	public boolean addProduct(Product productDetails) throws ProductAlreadyExistsException;
	public boolean updateProduct(Product productDetails,String productId);
	public boolean deleteProduct(String productId);
}