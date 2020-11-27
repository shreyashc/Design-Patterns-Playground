public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please Enter Your Pin");
        atmMachine.setATMState(atmMachine.getYesCardState());

    }

    @Override
    public void ejectCard() {
        System.out.println("Card Not inserted");

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Card Not inserted");

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Card Not inserted");

    }

}
