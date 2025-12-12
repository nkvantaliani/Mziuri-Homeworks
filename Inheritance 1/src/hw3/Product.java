package hw3;

public class Product {
    private double price;
    private double expireDate;

    public Product(double price, double expireDate) {
        this.price = price;
        this.expireDate = expireDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            return;
        }
        this.price = price;
    }

    public double getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(double expireDate) {
        this.expireDate = expireDate;
    }
}
