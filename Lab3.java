import java.util.Arrays;
import java.util.Comparator;

/**
 * Лабораторна робота №3.
 * Виконавець: Максимовський Назар Русланович
 * Група: ІМ-31
 * Варіант: C11=5
 */
public class Lab3 {

    /**
     * Виконавчий метод (main) згідно з завданням.
     */
    public static void main(String[] args) {

        Cosmetics[] products = new Cosmetics[]{
                new Cosmetics("L'Oréal", "Infallible Lipstick", "Makeup", 15.99, 4.5),
                new Cosmetics("Nivea", "Soft Cream", "Skincare", 8.49, 4.8),
                new Cosmetics("Chanel", "No. 5", "Fragrance", 150.00, 4.9),
                new Cosmetics("Maybelline", "Sky High Mascara", "Makeup", 12.99, 4.3),
                new Cosmetics("The Ordinary", "Niacinamide Serum", "Skincare", 7.50, 4.7)
        };

        System.out.println("--- Initial Array ---");
        printArray(products);

        Arrays.sort(products, Comparator.comparingDouble(Cosmetics::getPrice));
        System.out.println("\n--- Sorted by PRICE (Ascending) ---");
        printArray(products);

        Arrays.sort(products, Comparator.comparingDouble(Cosmetics::getRating).reversed());
        System.out.println("\n--- Sorted by RATING (Descending) ---");
        printArray(products);

        System.out.println("\n--- Searching for identical object ---");

        Cosmetics searchTarget = new Cosmetics("Nivea", "Soft Cream", "Skincare", 8.49, 4.8);
        System.out.println("Searching for: " + searchTarget);

        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(searchTarget)) {
                System.out.println("Found! Object is at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Object not found in the array.");
        }
    }

    /**
     * Допоміжний метод для друку масиву в консоль.
     *
     * @param array Масив об'єктів Cosmetics
     */
    public static void printArray(Cosmetics[] array) {
        for (Cosmetics product : array) {
            System.out.println(product);
        }
    }
}