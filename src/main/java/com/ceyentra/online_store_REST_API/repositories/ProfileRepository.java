package com.ceyentra.online_store_REST_API.repositories;

import com.ceyentra.online_store_REST_API.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
