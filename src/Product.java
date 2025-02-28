
public abstract class Product {
    //alt+enter, constructor
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private String name;

    private int price;

    //getters/setters


    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
