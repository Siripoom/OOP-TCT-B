class CommissionedEmployee extends Employee {
  private double baseSalary;
  private double commissionRate;
  private double sales;

  public CommissionedEmployee(String name, double baseSalary, double commissionEarned, double sales) {
    super(name);
    this.baseSalary = baseSalary;
    this.commissionRate = commissionEarned;
    this.sales = sales;
  }

  @Override
  public double calculatePay() {
    return baseSalary + (commissionRate * sales);
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public double getSales() {
    return this.sales;
  }

  public void setSales(double sales) {
    this.sales = sales;
  }

  public double getCommissionRate() {
    return commissionRate;
  }

  public void setCommissionRate(double commissionEarned) {
    this.commissionRate = commissionEarned;
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