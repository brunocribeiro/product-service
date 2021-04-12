package com.brunocesar.product.repository;

import com.brunocesar.product.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends CrudRepository<Product, Long> {

}