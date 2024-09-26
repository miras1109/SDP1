class FoodProduct implements Product {
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;
    }
}

class ElectronicsProduct implements Product {
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.05;
    }
}


class ClothingProduct implements Product {
    public double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.15;
    }
}

class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}
public class Task {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        Product food = new FoodProduct(600);
        Product electronics = new ElectronicsProduct(400);
        Product clothing = new ClothingProduct(1000);

        System.out.println("food discount is " + calculator.calculateDiscount(food));
        System.out.println("electronics discount is " + calculator.calculateDiscount(electronics));
        System.out.println("clothing discount is " + calculator.calculateDiscount(clothing));
    }
}
