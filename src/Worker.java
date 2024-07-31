import java.time.Year;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        return Year.now().getValue() - Integer.parseInt(birthDate);
    }

    public double collectPay() {
        return 123;
    }

    public void terminate(String endDate) {
        System.out.println("Terminated " + endDate);
    }
}
