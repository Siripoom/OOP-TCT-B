import java.util.UUID;

public abstract class Employee {
    private String name;
    private String idNumber = UUID.randomUUID().toString();

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return this.idNumber;
    }

    public String setName(String name) {
        return name;
    }

    public abstract double calculatePay();

    public abstract void showDetail();

}
