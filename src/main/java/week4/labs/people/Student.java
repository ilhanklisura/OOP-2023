package week4.labs.people;

public class Student extends Person {
    private static final int INITIAL_CREDITS = 0;

    private String studentId;
    private int credits;

    public Student(String name, String address, String studentId) {
        super(name, address);
        this.studentId = studentId;
        this.credits = INITIAL_CREDITS;
    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits += 5; // Assuming each study session adds 5 credits
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudent ID: " + studentId;
    }
}

