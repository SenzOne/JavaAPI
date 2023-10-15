package homeworks.hw7;

import homeworks.hw6.Laptopold;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptopold l1 = new Laptopold("ThinkPad", 8, 512, "win 10", "Black");
        Laptopold l2 = new Laptopold("ThinkPad", 8, 512, "win 10", "Blue");
        Laptopold l3 = new Laptopold("Macbook", 16, 512, "mac os", "Silver");
        Laptopold l4 = new Laptopold("Macbook", 16, 1024, "mac os", "Silver");
        Laptopold l5 = new Laptopold("Macbook", 16, 1024, "mac os", "Silver");


        System.out.println("Задание 1\n");
        HashSet<Laptopold> laptopolds = new HashSet<>(List.of(l1, l2, l3));
        System.out.printf("Уникальных моделей: %d \n %s \n\n", laptopolds.size(), laptopolds);


        System.out.println("Задание 2\n");
        Laptopold.filter("color", "Black", l1, l2, l3, l4, l5);
        Laptopold.filter("ssd", 1000, l1, l2, l3, l4, l5);
        Laptopold.filter("ssd", 5000, l1, l2, l3, l4, l5);
    }
}



