package Products;

public class Product {
    private int id;
    private String description;
    private int stock;
    private float price;
    private String expiration;
    private int discount;
    private int sales;
    private float discountf;
    
    public Product(String description, int stock, float price, String expiration, int discount) {
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.expiration = expiration;
        this.discount = discount;
        this.sales = 0;
    }

    public Product(int id, String description, float price, String expiration, int stock, int discount, int sales) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.expiration = expiration;
        this.stock = stock;
        this.discount = discount;
        this.sales = sales;
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
    
    public void setSales(int sales) {
        this.sales = sales;
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

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSales() {
        return sales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDiscountf() {
        return discountf;
    }

    public void setDiscountf(float discountf) {
        this.discountf = discountf;
    }



}
