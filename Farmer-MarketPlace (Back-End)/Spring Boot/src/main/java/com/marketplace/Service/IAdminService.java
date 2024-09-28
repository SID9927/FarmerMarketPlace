package com.marketplace.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.marketplace.Entity.Category;
import com.marketplace.Entity.Farmer;
import com.marketplace.Entity.OrderDetails;
import com.marketplace.Entity.StockDetails;
import com.marketplace.Entity.User;

public interface IAdminService {

	public boolean AddFarmer(Farmer farmer);
	public boolean AddProduct(int farmerid, StockDetails product);
	public boolean RemoveFarmer(int farmerid);
	public boolean RemoveProduct(int productid);
	public boolean UpdateProduct(StockDetails product);
	public boolean UpdateFarmer(Farmer farmer);
	public Farmer GetFarmerDetails(int farmerid);
	public StockDetails GetProductDetails(int productid);
	public Category GetCategory(int catid);
	public boolean SetCategory(String category);
	public boolean RemoveCategory(int catid);
	String saveImage(int productId, MultipartFile imgFile) throws IOException;
	byte[] restoreImage(int empId) throws IOException;
	public List<Category> getAllCategory();
	public List<OrderDetails> getAllOrders();
	public List<User> getAllUser();
	boolean UpdateUser(User user);
	byte[] restoreImageAgain(String productName)throws IOException;
}
