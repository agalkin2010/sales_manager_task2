# Класс SalesManadger

## Описание класса:
Класс управляет массивом int.
Метод Max выдает максимальное значение из массива


Код класса:
```java
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

}
```