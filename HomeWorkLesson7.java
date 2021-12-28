/*
 * Java 1. Homework #7
 * @autor Galina Nasonova
 * @version 28.12.2021
 */
public class HomeWorkLesson7 {
    public static void main(String[]args) {
        Cat[]cat = new Cat[3];
        cat[0] = new Cat("Filimon", 7, false);
        cat[1] = new Cat("Mursik", 6, false);
        cat[2] = new Cat("Dusa", 7, false);
        Plate plate = new Plate(19);
        System.out.println(plate);
        // покормили котов, еда кончилась, некоторые остались голодные
        for (int i = 0; i < 3; i++) {
            System.out.println(cat[i].eat(plate));
            System.out.println(plate);
        }
        // добавили еды, покормили, сытые есть не стали, голодные наелись
        plate.addFood(15);
        for (int i = 0; i < 3; i++) {
            System.out.println(cat[i].eat(plate));
            System.out.println(plate);
        }
    }

}
class Cat {
    private String name;
    private int appetite;
    private boolean full;
    Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }
    String eat(Plate p) {
        if (full)
            return "Cat: " + name + " full";
        if (p.decreaseFood(appetite)) {
            this.full = true;
            return "Cat: " + name + ", ate. Appetite: " + appetite;
        } else {
            this.full = false;
            return "Cat: " + name + " hungry. Appetite: " + appetite;
        }
    }
     @ Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + ", full:" + full;
    }
}

class Plate {
    private int food;
    Plate(int food) {
        this.food = food;
    }
    boolean decreaseFood(int food) {
        if (this.food < food) {
            this.food -= food;
            return false;
        } else {
            this.food -= food;
            return true;
        }
    }
    void addFood(int food) {
        this.food = food;
    }

    public String toString() {
        return "Food: " + food;
    }
}
