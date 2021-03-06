package com.example.chap01_userinfo;

import java.sql.Connection;
import java.util.List;

public interface UserDao {
    void add(User user);

    User get(String id);

    List<User> getAll();

    public void deleteAll();

    int getCount();

    public void update(User user1);


}
