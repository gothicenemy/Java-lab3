import java.util.Objects;

/**
 * Клас "Косметика" (Cosmetics).
 * Визначений згідно з варіантом 5.
 * Містить 5 полів: бренд, назва, категорія, ціна та рейтинг.
 */
public class Cosmetics {

    private String brand;
    private String name;
    private String category;
    private double price;
    private double rating;

    /**
     * Конструктор для створення об'єкта Cosmetics.
     *
     * @param brand    Бренд продукту
     * @param name     Назва продукту
     * @param category Категорія (напр., "Skincare", "Makeup")
     * @param price    Ціна продукту
     * @param rating   Рейтинг продукту
     */
    public Cosmetics(String brand, String name, String category, double price, double rating) {
        this.brand = brand;
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    /**
     * Повертає рядкове представлення об'єкта.
     * Використовується для зручного виведення в консоль.
     */
    @Override
    public String toString() {
        return "Cosmetics{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    /**
     * Перевіряє, чи є два об'єкти Cosmetics "ідентичними".
     * Об'єкти вважаються ідентичними, якщо всі їхні поля збігаються.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cosmetics cosmetics = (Cosmetics) o;
        return Double.compare(cosmetics.price, price) == 0 &&
                Double.compare(cosmetics.rating, rating) == 0 &&
                Objects.equals(brand, cosmetics.brand) &&
                Objects.equals(name, cosmetics.name) &&
                Objects.equals(category, cosmetics.category);
    }

    /**
     * Генерує хеш-код на основі полів об'єкта.
     * Необхідно перевизначати, якщо перевизначено equals().
     */
    @Override
    public int hashCode() {
        return Objects.hash(brand, name, category, price, rating);
    }
}