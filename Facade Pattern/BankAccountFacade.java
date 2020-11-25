public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    BankFundsCheck bankFundsCheck;

    WelcomeToBank welcomeToBank;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        bankFundsCheck = new BankFundsCheck();
        welcomeToBank = new WelcomeToBank();

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (accountNumberCheck.accountActive(getAccountNumber()) && securityCodeCheck.isCodeCorrect(getSecurityCode())
                && bankFundsCheck.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction complete \n");
        } else {
            System.out.println("Transaction Failed");
        }
    }

    public void depositCash(double cashToDeposit) {
        if (accountNumberCheck.accountActive(getAccountNumber())
                && securityCodeCheck.isCodeCorrect(getSecurityCode())) {
            bankFundsCheck.makeDeposit(cashToDeposit);
            System.out.println("Transaction complete\n");
        } else {
            System.out.println("Transaction Failed");
        }
    }
}
