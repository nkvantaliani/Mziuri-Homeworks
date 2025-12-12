import hw3.Product;
import hw3.Milk;
import hw3.Cake;
import hw3.Sandwich;
import hw3.Store;

public class Main {
    public static void main(String[] args) {

        Milk milk1 = new Milk(10, 20250911, 2);
        Cake cake1 = new Cake(23, 20250304, 1);
        Sandwich sandwich1 = new Sandwich(5.99, 20250101, 15);

        Product[] products = { milk1, cake1, sandwich1 };
        Store store = new Store(products);

        for (int i = 0; i < store.getProducts().length; i++) {
            Product p = store.getProducts()[i];
            System.out.println(p.getPrice() +", " + p.getExpireDate());
        }
    }
}
