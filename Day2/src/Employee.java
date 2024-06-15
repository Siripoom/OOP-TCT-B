public class Employee {
  private String id;
  private String name;
  private double salary;

  public Employee() {
    this.id = "0123TH";
    this.name = "User";
    this.salary = 10000.0;
  }

  public Employee(String id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalary(double salary) {
    if (salary == 0) {
      this.salary = 10000.0;
    } else {
      this.salary = Math.abs(salary);
    }
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public double getSalary() {
    return this.salary;
  }

  public void displayDetails() {
    System.out.println("=====Employee detail=====");
    System.out.println("ID: " + this.id);
    System.out.println("Name: " + this.name);
    System.out.println("Salary: " + this.salary);
  }
}
