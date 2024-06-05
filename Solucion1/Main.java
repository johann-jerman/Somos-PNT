package Solucion1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = LoadProductList();

        PrintListOfProduct(products);

        Collections.sort(products);

        PrintMoreExpensive(products);
        PrintMoreCheaper(products);
    }

    public static List<Product> LoadProductList(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Coca-Cola Zero", 20, "1.5", "Litros"));
        products.add(new Product("Coca-Cola", 18, "1.5", "Litros"));
        products.add(new Product("Shampoo Sedal", 19, "500ml", "Contenido"));
        products.add(new Product("Frutillas", 64, "kilo", "Unidad de venta"));
        return  products;
    }
    public static void PrintListOfProduct(List<Product> products){
        for(Product product : products){
            System.out.println(product.toString());
        }
    }
    public static void PrintMoreExpensive(List<Product> products){
        String message = "Producto mas caro: " + products.get(products.size() - 1).getName();
        System.out.println(message);
    }

    public static void PrintMoreCheaper(List<Product> products){
        String message = "Producto mas barato: " + products.get(0).getName();
        System.out.println(message);
    }
}
