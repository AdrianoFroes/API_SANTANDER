package com.froes.apisantander.domain.service;

import com.froes.apisantander.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
