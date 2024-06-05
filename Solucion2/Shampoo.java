package Solucion2;

public class Shampoo extends Product {
    private String Capacity;

    public Shampoo(String name, int price, String capacity) {
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
        return "Nombre: "+ this.getName()+
                " /// Contenido: "+ this.getCapacity() +
                " /// Precio: $"+ this.getPrice();
    }
}
