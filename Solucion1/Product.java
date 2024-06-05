package Solucion1;

public class Product implements  Comparable<Product> {
    private String Name;
    private int Price;
    private  String Capacity;
    private  String TypeOfCapacity;

    public Product(String name, int price, String capacity, String typeOfCapacity) {
        this.Name = name;
        this.Price = price;
        this.Capacity = capacity;
        this.TypeOfCapacity = typeOfCapacity;
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

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String capacity) {
        Capacity = capacity;
    }

    public String getTypeOfCapacity() {
        return TypeOfCapacity;
    }

    public void setTypeOfCapacity(String typeOfCapacity) {
        TypeOfCapacity = typeOfCapacity;
    }

    @Override
    public int compareTo(Product product) {
        return Integer.compare(this.Price, product.Price);
    }

    @Override
    public String toString() {
        return "Nombre: "
                + this.getName() +
                " /// Precio: $"
                + this.getPrice()
                + " /// "
                + this.getTypeOfCapacity()
                + ": " + this.getCapacity() ;
    }
}
