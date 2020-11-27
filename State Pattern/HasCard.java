public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can only insert ine card at a time");

    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("You entered correct pin");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        } else {
            System.out.println("Wrong PIN");
            atmMachine.correctPinEntered = false;
            System.out.println("You card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have not entered PIN");

    }

}
