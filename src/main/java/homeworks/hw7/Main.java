package homeworks.hw7;


import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("ThinkPad", 8, 512, "win 10", "Black");
        Laptop l2 = new Laptop("ThinkPad", 8, 512, "win 10", "Blue");
        Laptop l3 = new Laptop("Macbook", 16, 512, "mac os", "Silver");
        Laptop l4 = new Laptop("Macbook", 16, 1024, "mac os", "Silver");
        Laptop l5 = new Laptop("Macbook", 16, 1024, "mac os", "Silver");


        System.out.println("Задание 1\n");
        HashSet<Laptop> Laptops = new HashSet<>(List.of(l1, l2, l3));
        System.out.printf("Уникальных моделей: %d \n %s \n\n", Laptops.size(), Laptops);


        System.out.println("Задание 2\n");
        Laptop.filter("color", "Black", l1, l2, l3, l4, l5);
        Laptop.filter("ssd", 1000, l1, l2, l3, l4, l5);
        Laptop.filter("ssd", 5000, l1, l2, l3, l4, l5);
    }
}



