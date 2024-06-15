public class Manager extends Employee {
  private String department;

  public Manager() {
    super();
    this.department = "IT";
  }

  public Manager(String dept, String id, String name, double salary) {
    super(id, name, salary);
    this.department = dept;
  }

  public void setDepartment(String dept) {
    this.department = dept;
  }

  public String getDepartment() {
    return this.department;
  }

  public void displayDetails() {
    System.out.println("=====Manager detail=====");
    System.out.println("ID: " + super.getId());
    System.out.println("Name: " + super.getName());
    System.out.println("Department: " + this.department);
    System.out.println("Salary: " + super.getSalary());
  }
}
