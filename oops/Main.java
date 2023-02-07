import model.Account;
import model.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();

        Account sbi = new Account(24324, "245452454235", "test",
                "test@gmail.com", "545452252455");

        System.out.println(sbi.toString());
    }
}
