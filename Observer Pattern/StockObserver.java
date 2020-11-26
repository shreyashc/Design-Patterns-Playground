public class StockObserver implements Observer {
    private static int observerIdTracker = 0;
    private int observerId;

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New Observer: " + this.observerId);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = applPrice;
        this.googPrice = googPrice;

        this.printThePrices();
    }

    private void printThePrices() {
        System.out.println(
                "Observer: " + observerId + "\nIBM " + ibmPrice + "\nAAPL " + aaplPrice + "\nGOOG " + googPrice + "\n");
    }

}
