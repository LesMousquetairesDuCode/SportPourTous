package fr.sportpourtous.application.services;

import fr.sportpourtous.domain.UserId;
import org.springframework.stereotype.Service;
import fr.sportpourtous.domain.UserConfiguration;


public final class UserService {

    private final UserConfiguration userConfiguration;
    private final AccountRepository accountRepository;

    public UserService(UserConfiguration userConfiguration, UserRepository userRepository) {
        this.accountConfiguration = accountConfiguration;
        this.accountRepository = accountRepository;
    }

    public UserId createUser(CreateUserCommand createUserCommand) {
        var accountId = accountRepository.nextId();
        var account = new Account(accountId, createAccountCommand.initialMoney);
        accountRepository.save(account);
        return accountId;
    }

    public void sendMoney(SendMoneyCommand sendMoneyCommand) {
        var sourceAccountId = sendMoneyCommand.sourceAccountId;
        var targetAccountId = sendMoneyCommand.targetAccountId;
        var amount = sendMoneyCommand.amount;
        if (mayNotTransfer(amount)) {
            throw AccountApplicationException.exceededThreshold(sourceAccountId, targetAccountId, amount);
        }

        var sourceAccount = accountRepository.findById(sourceAccountId);
        var targetAccount = accountRepository.findById(targetAccountId);

        sourceAccount.withdraw(amount);
        targetAccount.deposit(amount);

        accountRepository.save(sourceAccount);
        accountRepository.save(targetAccount);
    }

    private boolean mayNotTransfer(Money amount) {
        return accountConfiguration.transferThreshold() < amount.value();
    }
}
