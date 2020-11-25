public class AccountNumberCheck {
    private int accountNumber = 12345;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int acctNumCheck) {
        return acctNumCheck == getAccountNumber();
    }

}
