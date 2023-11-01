package JavaOOP.JavaInheritance;

// Superclass
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}

// Subclass
class Cat extends Animal {
    public Cat(String name) {
        super(name); // Call the constructor of the superclass
    }

    public void meow() {
        System.out.println(getName() + " is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        Cat cat = new Cat("Tom");

        dog.eat();
        dog.bark();
        dog.sleep();

        cat.eat();
        cat.meow();
        cat.sleep();
    }
}
