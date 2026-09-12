public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(101, "Ravi", 17, 200, "Savings");

        account.deposit(1000);
        account.withdraw(500);

        AccountRepository repository = new AccountRepository();
        NotificationService notificationService = new NotificationService();

        repository.save(account);

        notificationService.send(
                "Your deposit and withdrawal were successful. Current balance: Rs. "
                        + account.getBalance()
        );
    }
}
