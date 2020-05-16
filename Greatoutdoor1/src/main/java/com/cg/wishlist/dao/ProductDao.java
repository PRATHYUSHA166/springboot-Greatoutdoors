package com.cg.wishlist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Product;
import com.cg.entity.Wishlist;
@Repository
public interface ProductDao extends  JpaRepository<Product, Integer>  {
	
	

}
