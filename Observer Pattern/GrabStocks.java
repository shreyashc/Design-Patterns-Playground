public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(107.00);
        stockGrabber.setApplPrice(667.2);
        stockGrabber.setGoogPrice(233);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(157.00);
        stockGrabber.setApplPrice(687.2);
        stockGrabber.setGoogPrice(283);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);

        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);

        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }
}
