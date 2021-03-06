package com.cg.entity;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "product_tbl")
public class Product  {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @SequenceGenerator(name="mygen",sequenceName="product_seq",allocationSize=1)
	    @Column(name = "productid")
	    private int productid;

	    @Column(name = "productname")
	    private String productname;

	    @Column(name = "price")
	    private Double Price;
	    
	    
	    @OneToMany(mappedBy="product")
	    @JsonIgnore
	   	List<Wishlist>  wishlist = new ArrayList<>();

	    
		public int getProductid() {
			return productid;
		}

		public void setProductid(int productid) {
			this.productid = productid;
		}

		public String getProductname() {
			return productname;
		}

		public void setProductname(String productname) {
			this.productname = productname;
		}

		public Double getPrice() {
			return Price;
		}

		public void setPrice(Double price) {
			Price = price;
		}

		public List<Wishlist> getWishlist() {
			return wishlist;
		}

		public void setWishlist(List<Wishlist> wishlist) {
			this.wishlist = wishlist;
		}


	   
	    
	}
    
    

