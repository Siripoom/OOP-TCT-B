public class Main {
  public static void main(String[] args) {
    Employee hourlyEmployee = new HourlyEmployee("John Doe", 15.0, 40);
    Employee salariedEmployee = new SalariedEmployee("Jane Smith", 52000);
    Employee commissionedEmployee = new CommissionedEmployee("Jim Brown", 30000, 0.05, 2000);

    hourlyEmployee.showDetail();
    salariedEmployee.showDetail();
    commissionedEmployee.showDetail();
  }
}