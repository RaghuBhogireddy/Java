package abstraction;

public abstract class Parent {


    public Parent() {
    }

    void concreteMethod() {
        System.out.println("ConcreteMethod from Parent");
    }

    abstract void nonConcreteMethod();
}
