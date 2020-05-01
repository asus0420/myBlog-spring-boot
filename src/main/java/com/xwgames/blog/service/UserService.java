package com.xwgames.blog.service;

import com.xwgames.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
