package week5.lectures.person;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0;
        this.weight = 0;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years old.");
    }

    public void becomeOlder() {
        this.age++;
    }

    public boolean isAdult() {
        if(this.age >= 18) {
            return false;
        }
        return true;
    }

    public double weightIndex() {
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + ", age " + this.age + " years old and my weight is " + this.weight + " kg's.";
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public boolean olderThan(Person compared) {
        if(this.age > compared.age) {
            return true;
        }
        return false;
    }
}
