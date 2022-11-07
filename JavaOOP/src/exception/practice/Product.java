package exception.practice;

public class Product {
    String description;
    int price;
    int id;

    public Product(String description, int price, int id) {
        this.description = description;
        this.price = price;
        this.id = id;
    }

    public Product(){
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
