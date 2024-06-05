package Solucion2;

public class Food extends Product{
    private String Capacity;

    public Food(String name, int price, String capacity) {
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
                " /// Precio: $"+ this.getPrice()+
                " /// Unidad de Venta: "+ this.getCapacity();
    }
}
