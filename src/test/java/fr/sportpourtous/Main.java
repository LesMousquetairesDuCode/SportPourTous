package fr.sportpourtous;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var userConfiguration = new UserConfiguration(1000L);


        var userRepository = new InMemoryUserRepository();
        var paymentAccountRepository = new InMemoryPaymentAccountRepository();

        var userService = new UserService(userRepository);
        var bankAccountService = new paymentService(paymentAccountRepository);

        var userController = new UserController(userService);

        var accountId1 = userController.create();
        var accountId2 = userController.create();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your bank account to register:");
        String bankAccount = scanner.nextLine();

        System.out.println("User created with ID: " + userId);
        var newUser = userRepository.findById(userId);

        System.out.println("New registered user: " + newUser);
    }
}