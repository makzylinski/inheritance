public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    Employee(long employeeId, String hireDate, String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
