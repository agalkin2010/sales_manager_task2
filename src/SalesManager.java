
public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }

        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }

        return min;
    }

    public long cutAvg() {

        long sum = 0;
        long k = 0;
        long maxSale = max();
        long minSale = min();

        for (long sale : sales) {
            if (sale != maxSale && sale != minSale) {
                sum += sale;
                k++;
            }
        }

        return (k > 0) ? sum / k : -1;
    }

}
