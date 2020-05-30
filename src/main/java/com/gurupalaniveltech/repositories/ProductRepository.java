package com.gurupalaniveltech.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gurupalaniveltech.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
