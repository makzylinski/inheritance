public class Main {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee(160, 213769420, "2024", "Max", "1995", "2024");

        System.out.println(employee);
        employee.getAge();
        employee.collectPay();
        employee.getDoublePay();

        System.out.println("Employee's age is " + employee.getAge() + ", collected pay " + employee.collectPay() + ", doubled pay " + employee.getDoublePay());
    }
}
