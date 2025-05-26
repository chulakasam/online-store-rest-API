package com.ceyentra.online_store_REST_API.repositories;

import com.ceyentra.online_store_REST_API.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
