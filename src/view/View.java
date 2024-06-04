package view;

import controller.UserController;
import model.User;
import model.dto.UserDto;

import java.util.List;
import java.util.Scanner;

public class View {
    public static final UserController userController = new UserController();

    public static void UI() {
        System.out.println("Displaying all users:");
        List<UserDto> users = userController.getAllUsers();
        users.forEach(userDto -> System.out.println(userDto.toString()));
    }
    public static void addNewUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new user ID:");
        int userId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new user name:");
        String userName = scanner.nextLine();
        System.out.print("Enter new user email:");
        String userEmail = scanner.nextLine();
        User newUser = new User(userId, userName, userEmail);
        userController.addNewUser(newUser);
        UI();
    }
    public static void removeUserById(int userId) {
        userController.removeById(userId);
        UI();
    }
}
