/*
 * Java 1. Homework #6
 * @autor Galina Nasonova
 * @version 26.12.2021
 */
public class HomeWorkLesson6 {
    public static void main(String[]args) {
        Animal cat = new Cat("Filimon", 200, 0);
        Animal dog = new Dog("Tobol", 500, 10);
        Animal[]animals = {
            cat,
            dog
        };
        for (Animal a: animals) {
            System.out.println(a.run(100));
            System.out.println(a.run(550));
            System.out.println(a.run(205));
            System.out.println(a.swim(15));
            System.out.println(a.swim(5));
        }
    }
}
interface IAnimal {
    abstract String swim(int dist);
    abstract String run(int dist);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int limit_run;
    protected int limit_swim;

    Animal(String name, int limit_run, int limit_swim) {
        this.name = name;
        this.limit_run=limit_run;
        this.limit_swim=limit_swim;
    }
     @ Override
    public String toString() {
        return name;
    }
}
class Dog extends Animal {
    Dog(String name, int limit_run, int limit_swim) {
        super(name,limit_run, limit_swim);
    }
     @ Override
    public String run(int dist) {
        if (dist > limit_run) {
            return "Dog " + name + " don't run: " + dist + ". Max dist - 500 m";
        } else {
            return "Dog " + name + " run: " + dist;
        }
    }
    public String swim(int dist) {
        if (dist > limit_swim) {
            return "Dog " + name + " don't swim: " + dist + ". Max dist - 10 m";
        } else {
            return "Dog " + name + " swim: " + dist;
        }
    }
}

class Cat extends Animal {
    Cat(String name, int limit_run, int limit_swim) {
        super(name, limit_run, limit_swim);
    }
     @ Override
    public String run(int dist) {
        if (dist > limit_run) {
            return "Cat " + name + " don't run: " + dist + ". Max dist - 200 m";
        } else {
            return "Cat " + name + " run: " + dist;
        }
    }
    public String swim(int dist) {
        return "Cat not swim";
    }
}
