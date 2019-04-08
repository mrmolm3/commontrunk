package com.laliento.commontrunk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laliento.commontrunk.entity.Product;

/**
 * @author Eduardo Cruz Zamorano
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
