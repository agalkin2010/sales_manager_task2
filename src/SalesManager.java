import java.util.Arrays;
import java.util.stream.IntStream;

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

    public int cutAvg() {
        int cutAvg = -1;

        int[] newArray = IntStream.of(sales)
                .filter(x -> x != IntStream.of(sales).max().getAsInt() &&
                        x != IntStream.of(sales).min().getAsInt()).toArray();

        cutAvg = (int) Math.round(Arrays.stream(newArray).average().getAsDouble());

        return cutAvg;
    }

}
