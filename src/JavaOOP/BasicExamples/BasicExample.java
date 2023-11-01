package JavaOOP.BasicExamples;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class BasicExample {
    public static void main(String[] args) {

        Person person1 = new Person("Alice", 30);

        System.out.println("Person 1's name: " + person1.getName());
        System.out.println("Person 1's age: " + person1.getAge());

        person1.setName("Bob");
        person1.setAge(25);

        person1.displayInfo();
    }
}
