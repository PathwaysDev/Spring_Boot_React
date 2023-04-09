package com.pathways.dev.trail1.model.user;

import java.util.Collection;
import java.util.Optional;
import com.pathways.dev.trail1.model.user.User;


public interface UserService {
    Collection< User > findAll();

    void save(User user);

    Optional< User > findById(Long id);

    void delete(long id);
}
