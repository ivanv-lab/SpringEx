package com.dbcrud.repositories;

import com.dbcrud.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Long> {
    List<Product> findByNameContainingIgnoreCase(String name);
    Product findById(long id);
}
