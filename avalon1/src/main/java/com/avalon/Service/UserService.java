package com.avalon.Service;

import com.avalon.Entity.User;

public interface UserService {
    public User findByUserName(String username);
}
