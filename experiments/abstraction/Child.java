package abstraction;

public class Child extends Parent{
    @Override
    void nonConcreteMethod() {
        System.out.println("NonConcreteMethod called from child");
    }

    @Override
    void concreteMethod() {
        System.out.println("ConcreteMethod from Child");
    }


    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent() {
            @Override
            void nonConcreteMethod() {
                System.out.println("NonConcrete from Parent");
            }
        };
        parent.nonConcreteMethod();
        child.concreteMethod();
    }
}
