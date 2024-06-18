class SalariedEmployee extends Employee {
  private double annualSalary;

  public SalariedEmployee(String name, double annualSalary) {
    super(name);
    this.annualSalary = annualSalary;
  }

  @Override
  public double calculatePay() {
    return annualSalary / 52; // Assuming weekly pay
  }

  // Getter and setter for annualSalary
  public double getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
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