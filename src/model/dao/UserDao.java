package model.dao;

import model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void removeById(Integer id);
    void addNewUser(User user);
    void updateUser(User user);
}
