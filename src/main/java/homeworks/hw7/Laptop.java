package homeworks.hw7;

import homeworks.hw6.Laptopold;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Laptop {
    private String title;
    private String os;
    private String color;
    private int ram;
    private int ssd;


    public Laptop(String title, int ram, int SSD, String os, String color) {
        this.title = title;
        this.ram = ram;
        this.ssd = SSD;
        this.os = os;
        this.color = color;
    }


    @Override
    public String toString() {
        return String.format("%s, %s ram, %s ssd, color: %s", title, ram, ssd, color);
    }

    public boolean equals(Object laptop) {
        Laptopold newLaptopold = (Laptopold) laptop;
        return this.title.equals(newLaptopold.title) &&
                Objects.equals(this.os, newLaptopold.os) &&
                Objects.equals(this.color, newLaptopold.color) &&
                this.ram == newLaptopold.ram &&
                this.ssd == newLaptopold.ssd;
    }

    public int hashCode() {
        return (this.title.hashCode() + this.os.hashCode() + this.color.hashCode()
                + this.ram + this.ssd);
    }

    /*
    // метод создает список обьектов и проверяет соответствие критерия полю, а так же соответствие
    // значения критерия значению поля.
     */
    public static void filter(String criteria, String criteriaValute, Laptopold... laptopolds) {
        LinkedList<Laptopold> lll = new LinkedList<>(List.of(laptopolds));
        HashSet<Laptopold> laptopoldHashSet = new HashSet<>();

        for (Laptopold laptopold : lll) {
            if (criteria.equals("title") && Objects.equals(laptopold.title, criteriaValute)) {
                laptopoldHashSet.add(laptopold);
            } else if (criteria.equals("color") && Objects.equals(laptopold.color, criteriaValute)) {
                laptopoldHashSet.add(laptopold);
            } else if (criteria.equals("os") && Objects.equals(laptopold.os, criteriaValute)) {
                laptopoldHashSet.add(laptopold);
            }
        }
        if (laptopoldHashSet.isEmpty()) {
            System.out.println("Ничего не найдено");
        } else {
            printResult(laptopoldHashSet);
        }
    }

    private static void printResult(HashSet<Laptopold> laptopoldHashSet) {
        for (Laptopold i : laptopoldHashSet) {
            System.out.println(i);
        }
    }

    /*
    // метод filter переопределен для значений типа int
     */
    public static void filter(String criteria, int criteriaValute, Laptopold... laptopolds) {
        LinkedList<Laptopold> lll = new LinkedList<>(List.of(laptopolds));
        HashSet<Laptopold> laptopoldHashSet = new HashSet<>();
        for (Laptopold laptopold : lll) {
            if (criteria.equals("ram") && (laptopold.ram >= criteriaValute)) {
                laptopoldHashSet.add(laptopold);
            } else if (criteria.equals("ssd") && (laptopold.ssd >= criteriaValute)) {
                laptopoldHashSet.add(laptopold);
            }
        }

        if (laptopoldHashSet.isEmpty()) {
            System.out.println("Ничего не найдено");
        } else {
            printResult(laptopoldHashSet);
        }
    }
}

