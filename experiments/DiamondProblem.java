public class DiamondProblem {
    public static void main(String[] args) {

    }
}




class child implements Test1, Test2 {

    @Override
    public void show() {
        Test1.super.show();
    }
}

interface Test1 {
    default void show() {
        System.out.println("Test1 - show");
    }
}

interface Test2 {

    default void show() {
        System.out.println("Test2 - show");
    }
}
