package com.maayanpolitzer.shop.repositories;

import com.maayanpolitzer.shop.models.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends CrudRepository<Product, String> {
}
