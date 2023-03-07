package homework_1;

public class Basket {
    private Product[] boughtProducts;

    public Basket(Product[] boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    public Product[] getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(Product[] boughtProducts) {
        this.boughtProducts = boughtProducts;
    }
}
