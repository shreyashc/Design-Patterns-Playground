public class TestBankAccount {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345, 12345);

        accessingBank.withdrawCash(120.00);
        accessingBank.withdrawCash(1000.00);
        accessingBank.depositCash(100);
    }
}
