package com.ceyentra.online_store_REST_API.repositories;

import com.ceyentra.online_store_REST_API.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
