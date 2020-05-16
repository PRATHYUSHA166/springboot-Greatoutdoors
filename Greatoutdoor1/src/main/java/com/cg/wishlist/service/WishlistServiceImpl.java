package com.cg.wishlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Product;
import com.cg.entity.Wishlist;
import com.cg.wishlist.dao.ProductDao;
import com.cg.wishlist.dao.Userdao;
import com.cg.wishlist.dao.WishlistDao;
import com.cg.wishlist.exception.WishlistException;


@Service
public class WishlistServiceImpl implements WishlistService   {
	@Autowired
	WishlistDao wishlistdao;

	@Autowired
	ProductDao productDao;
	
	@Autowired
	Userdao userdao;


	     @Override
	     public Product findProductrById(int productId) throws WishlistException {
	        Product product=null;
	        boolean flag=productDao.existsById(productId);
	        if(flag)
		{
		
		    product=productDao.findById(productId).get();

		}
		else
		{
			throw new WishlistException("id does not found");
		}
		
		    return product;
	    }

	     @Override
	     public List<Product> findAllProducts() throws WishlistException {
		    List<Product> list=productDao.findAll();
		    return list;
	    }

	     @Override
	     public Product createProduct(Product product) {
            Product tr=productDao.saveAndFlush(product);
		    return tr;
	    
	    }
	     @Override
	     public List<Wishlist> findAllWishlists() throws WishlistException {
		    List<Wishlist> list=wishlistdao.findAll();
		    return list;
	     }

		@Override
		public Wishlist createWishlist(Wishlist wishlist) {
			Wishlist wl=wishlistdao.saveAndFlush(wishlist);
		    return wl;
			
		}

		
		}

	
		

	
			


   
