package controller;

import model.User;
import model.dto.UserDto;
import model.service.UserService;
import model.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserService userService = new UserServiceImpl();

    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    public void addNewUser(User user) {
        userService.addNewUser(user);
    }

    public void removeById(Integer id) {
        userService.removeById(id);
    }

}