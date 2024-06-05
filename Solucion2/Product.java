package Solucion2;

public class Product implements  Comparable<Product> {
    private String Name;
    private int Price;

    public Product(String name, int price) {
        this.Name = name;
        this.Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }


    @Override
    public int compareTo(Product product) {
        return Integer.compare(this.Price, product.Price);
    }

}
