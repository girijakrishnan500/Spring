package com.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.domain.Product;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer>{
}
