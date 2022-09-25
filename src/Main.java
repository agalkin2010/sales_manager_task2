public class Main {

    public static void main(String[] args) {

        long[] salesArray = {5L, 7L, 15L, 3L};

        SalesManager salesManager = new SalesManager(salesArray);

        System.out.println(salesManager.max());
        System.out.println(salesManager.cutAvg());

    }
}
