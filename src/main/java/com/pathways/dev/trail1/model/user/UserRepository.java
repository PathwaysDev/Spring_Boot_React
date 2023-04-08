package com.pathways.dev.trail1.model.user;

import org.springframework.data.repository.CrudRepository;
import com.pathways.dev.trail1.model.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
