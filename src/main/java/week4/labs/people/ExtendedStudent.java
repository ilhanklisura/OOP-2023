package week4.labs.people;

import java.util.ArrayList;
import java.util.List;

public class ExtendedStudent extends ExtendedPerson {
    private String student_id;
    private List<Double> grades;

    public ExtendedStudent(String name, String address, int age, String country, String student_id) {
        super(name, address, age, country);
        this.student_id = student_id;
        this.grades = new ArrayList<>();
    }

    public String getStudentId() {
        return student_id;
    }

    public void setStudentId(String student_id) {
        this.student_id = student_id;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Grade must be between 0.0 and 100.0.");
        }
    }
}

