public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("card already inserted");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (cashToWithdraw > atmMachine.cashInMachine) {
            System.out.println("we don't have so much money");
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCashState());
        } else {
            System.out.println(cashToWithdraw + " waithdrawn from the machine");
            System.out.println("Your card is ejected");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            atmMachine.setATMState(atmMachine.getNoCardState());
            if (atmMachine.cashInMachine <= 0) {
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Pin alredy entered");

    }

}
