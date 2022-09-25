
public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }

        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }

        return min;
    }

    public int cutAvg() {

        int sum = 0;
        int k = 0;
        int maxSale = max();
        int minSale = min();

        for (int sale : sales) {
            if (sale != maxSale && sale != minSale) {
                sum += sale;
                k++;
            }
        }

        return (k > 0) ? sum / k : -1;
    }

}
