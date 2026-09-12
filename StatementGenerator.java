public class StatementGenerator {
    public String generate(BankAccount account) {
        return "Statement for Account " + account.getAccountNumber()
                + " (" + account.getName() + ") ----\n"
                + "Account Type: " + account.getAccountType() + "\n"
                + "Current Balance: Rs. " + account.getBalance() + "\n"
                + "----------------------------------------------------";
    }
}
