import model.Account;
import model.Car;

public class Main implements I2, I1 {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.describeCar();
//
//        Account sbi = new Account(24324, "245452454235", "test",
//                "test@gmail.com", "545452252455");
//
//        System.out.println(sbi.toString());
//        sbi.withdrawFunds(20000);
//        System.out.println(sbi.toString());
//        sbi.withdrawFunds(4325);
//        sbi.withdrawFunds(4324);
//        System.out.println(sbi.toString());


        I1 i1 = new Main();
        i1.hello();



    }

    @Override
    public void hello() {
        System.out.println("Hello");
    }
}


interface I1 {
    void hello();
}

interface I2 {
    void hello();
}
