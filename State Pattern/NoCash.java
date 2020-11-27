public class NoCash implements ATMState {
    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We dont have any money");
        System.out.println("your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());

    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject");

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have any money ");

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have any money ");
    }

}
