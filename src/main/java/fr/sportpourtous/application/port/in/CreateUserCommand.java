package fr.sportpourtous.application.port.in;

import java.util.Objects;

public final class CreateUserCommand {
    public final BankAccount bankAccount;

    public CreateUserCommand(BankAccount bankAccount) {
        this.bankAccount = Objects.requireNonNull(bankAccount);
    }
}