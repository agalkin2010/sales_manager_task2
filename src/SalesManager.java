
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
        boolean minFirst = false;
        boolean maxFirst = false;

        for (long sale : sales) {

            if (sale == maxSale && !maxFirst) {
                maxFirst = true;
                continue;
            }

            if (sale == minSale && !minFirst) {
                minFirst = true;
                continue;
            }

            sum += sale;
            k++;

        }

        return (k > 0) ? sum / k : -1;
    }

}
