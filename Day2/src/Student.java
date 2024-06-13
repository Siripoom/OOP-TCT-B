import java.util.ArrayList;
import java.util.List;

public class Student {
  private String name;
  private int id;
  private List<Double> grades; // Use a List to store multiple grades

  // Constructor
  public Student(String name, int id) {
    this.name = name;
    this.id = id;
    this.grades = new ArrayList<>();
  }

  // getter()
  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  // setter()
  public void setGrade(double grade) {
    this.grades.add(grade);
  }

  // Calculate average grade
  public double calculateAverageGrade() {
    if (grades.isEmpty()) {
      return 0.0; // Or throw an exception if no grades exist
    }

    double sum = 0;
    for (double grade : grades) {
      sum += grade;
    }

    return sum / grades.size();
  }

  public void showDetail() {
    System.out.println("Student Name: " + this.name);
    System.out.println("Student ID: " + this.id);
    System.out.println("Average Score: " + this.calculateAverageGrade());
    System.out.println("===================================");
  }

}
