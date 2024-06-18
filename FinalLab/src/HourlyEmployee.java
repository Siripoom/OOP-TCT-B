public class HourlyEmployee extends Employee {
  private double hourlyRate;
  private int hoursWorked;

  public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
    super(name);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  @Override
  public double calculatePay() {
    return hourlyRate * hoursWorked;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public int getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(int hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  @Override
  public void showDetail() {
    System.out
        .println(
            super.getId() + " "
                + this.getName() + " is paid: "
                + this.calculatePay());
  }
}
