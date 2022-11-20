package Products;

public class Product {
    private String description;
    private int stock;
    private float price;
    private String expiration;
    private int discount;
    private int sales;
    
    public Product(String description, int stock, float price, String expiration, int discount) {
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.expiration = expiration;
        this.discount = discount;
        this.sales = 0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    
}
