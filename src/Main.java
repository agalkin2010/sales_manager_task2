public class Main {

    public static void main(String[] args) {
        int[] salesArray = {5, 15, 3, 7};

        SalesManager salesManager = new SalesManager(salesArray);

        System.out.println(salesManager.max());
        System.out.println(salesManager.cutAvg());

    }
}
