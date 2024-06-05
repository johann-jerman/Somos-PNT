package Solucion2;

public class Dinks extends Product {
    private String Capacity;

    public Dinks(String name, int price, String capacity) {
        super(name, price);
        this.Capacity = capacity;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String capacity) {
        Capacity = capacity;
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.getName() +
                " /// Litros: "+ this.getCapacity()
                +" /// Precio: $"+ this.getPrice();
    }
}
