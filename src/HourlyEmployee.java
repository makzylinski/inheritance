public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    HourlyEmployee(double hourlyPayRate, long employeeId, String hireDate, String name, String birthDate, String endDate) {
        super(employeeId, hireDate, name, birthDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay() {
        return hourlyPayRate * 2;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
