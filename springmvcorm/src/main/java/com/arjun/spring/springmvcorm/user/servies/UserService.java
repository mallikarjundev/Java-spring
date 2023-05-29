package com.arjun.spring.springmvcorm.user.servies;

import java.util.List;

import com.arjun.spring.springmvcorm.user.entity.User;

public interface UserService {

	int save(User user);

	List<User> getUsers();

	User getUser(Integer id);
}
