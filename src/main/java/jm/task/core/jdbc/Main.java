package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Oli", "Pop", (byte) 12);
        userService.saveUser("Molly", "Pop", (byte) 44);
        userService.saveUser("Dolly", "Pop", (byte) 46);
        userService.saveUser("Lolly", "Pop", (byte) 20);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
