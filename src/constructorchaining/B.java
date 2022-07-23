package constructorchaining;

public class B extends A {
    private int c;

    public B() {
//        super("Naman");
        System.out.println("Constructor of B");
        this.c = 3;
    }
}
