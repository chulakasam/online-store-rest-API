package com.ceyentra.online_store_REST_API.repositories;

import com.ceyentra.online_store_REST_API.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}
