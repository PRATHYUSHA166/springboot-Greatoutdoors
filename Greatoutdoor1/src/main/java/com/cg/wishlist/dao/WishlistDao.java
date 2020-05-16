package com.cg.wishlist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Wishlist;

@Repository
public interface WishlistDao extends JpaRepository<Wishlist, Integer> {

	

}
