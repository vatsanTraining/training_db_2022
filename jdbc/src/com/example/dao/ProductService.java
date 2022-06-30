package com.example.dao;
import java.sql.*;
import java.util.*;
import com.example.entity.*;

public class ProductService {

	private Connection con;

	public ProductService(Connection con) {
		super();
		this.con = con;
	}
	
	public int updatePriceByName(String  productName, double newPrice) {
		
		int rowsUpdated=0;
		
		return rowsUpdated;
	}

	public int deleteById(int id) {
		
		String sql = "delete from vats_product where product_id=?";
		int rowsDeleted = 0;

		 try(PreparedStatement pstmt = con.prepareStatement(sql)){
				
			 pstmt.setInt(1,id);
			 
		 }catch(SQLException e) {
			  e.printStackTrace();
		 }
		
		return rowsDeleted;
	}
	
	public Optional<Product> findById(int id) {
		
		
		Optional<Product> obj = Optional.empty();
		
		String sql = "select * from vats_product where product_id=?";
		
		 try(PreparedStatement pstmt = con.prepareStatement(sql)){
				
			 pstmt.setInt(1,id);
			 
			 ResultSet rs = pstmt.executeQuery();
			 
			 if(rs.next()) {
					
				    int productId = rs.getInt("product_Id");
					String productName = rs.getString("product_name");
					double price = rs.getDouble("price");
					
					Product prod = new Product(productId, productName, price);
			
					obj=Optional.of(prod);
			 }
			 
		 }catch(SQLException e) {
			  e.printStackTrace();
		 }
		
		return obj; 
	}
	
	public int addProduct(Product product) {
		
		int rowAdded = 0;
		
		String sql = "insert into vats_product values(?,?,?)";
			
          try(PreparedStatement pstmt = con.prepareStatement(sql)){
	
        		pstmt.setInt(1,product.getProductId());
        		pstmt.setString(2,product.getProductName());
        		pstmt.setDouble(3, product.getPrice());
        	
			rowAdded = pstmt.executeUpdate();
						
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
		
	}
	
	public List<Product> findAll(){
		
		List<Product> productList = new ArrayList<Product>();
		
		String sql = "select * from vats_product";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int productId = rs.getInt("product_Id");
				String productName = rs.getString("product_name");
				double price = rs.getDouble("price");
				
				Product prod = new Product(productId, productName, price);
				
				productList.add(prod);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return productList;
		
		
	}
	
	
	public void usingTxn(Product prd1,Product prd2) {
		
		
		String sql = "insert into vats_product values(?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql);)
		{
			
			con.setAutoCommit(false);
			
			pstmt.setInt(1, prd1.getProductId());
			pstmt.setString(2, prd1.getProductName());
			pstmt.setDouble(3, prd1.getPrice());
			
			int rowAdded1 =pstmt.executeUpdate();
			
			pstmt.setInt(1, prd2.getProductId());
			pstmt.setString(2, prd2.getProductName());
			pstmt.setDouble(3, prd2.getPrice());
			
			int rowAdded2 = pstmt.executeUpdate();
			
			if(prd2.getPrice()>prd1.getPrice()) {
			     con.commit();
			} else {
				con.rollback();
			}
			
			System.out.println("Row Added:="+ rowAdded1+","+rowAdded2);
			
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}
		
	}
	
	

}
