package inheritance;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Objects;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("pitBull", "Big", 250.90);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if (Objects.equals(type, "wolf")){
            System.out.println("Ow Woooooo! ..");
        }else {
            bark();
        }
    }

    @Override
    public void move(String speed){
        super.move(speed);
        if (Objects.equals(speed, "slow")){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
    }

    private void run() {
        System.out.println("Dog Running ..");
    }

    private void bark(){
        System.out.println("Woof!! ..");
    }

    private void walk(){
        System.out.println("Dog walking ..");
    }

    private void wagTail(){
        System.out.println("Tail Wagging ..");
    }
}
