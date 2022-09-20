public class Main {

    public static void main(String[] args) {
        int[] salesArray = {5, 7, 15, 3};

        SalesManager salesManager = new SalesManager(salesArray);

        System.out.println(salesManager.max());
    }
}
