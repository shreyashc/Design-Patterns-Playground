import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
    private String stock;
    private double price;
    private Subject stockGrabber;
    DecimalFormat df;

    public GetTheStock(Subject stockGrabber, int newStartTime, String stock, double price) {
        this.stock = stock;
        this.price = price;
        this.stockGrabber = stockGrabber;
        df = new DecimalFormat("#.##");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            double randNum = (Math.random() * (0.6)) - 0.3;
            price = Double.valueOf(df.format(price + randNum));
            if (stock == "IBM")
                ((StockGrabber) stockGrabber).setIbmPrice(price);

            if (stock == "AAPL")
                ((StockGrabber) stockGrabber).setApplPrice(price);

            if (stock == "GOOG")
                ((StockGrabber) stockGrabber).setGoogPrice(price);

            System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum));
            System.out.println();

        }

    }

}
