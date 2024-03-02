package fr.sportpourtous;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var userConfiguration = new UserConfiguration(1000L);


        var userRepository = new InMemoryUserRepository();
        var bankAccountRepository = new InMemoryBankAccountRepository();

        var userService = new UserService(userRepository);
        var bankAccountService = new BankAccountService(bankAccountRepository);

        var userController = new YourUserController(userService);
        var bankAccountController = new YourBankAccountController(bankAccountService);


        var accountId1 = userController.create();
        var accountId2 = userController.create();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your bank account to register:");
        String bankAccount = scanner.nextLine();

        var userId = userController.create(bankAccount);

        System.out.println("User created with ID: " + userId);
        var newUser = userRepository.findById(userId);

        System.out.println("New registered user: " + newUser);
    }
}