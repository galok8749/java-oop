package constructorchaining;

public class A {
    private int a;
    private int b;

    A() {
        System.out.println("Constructor of A");
        this.a = 1;
        this.b = 2;
    }
    public A(String name) {
        System.out.println("Constructor of A " + name);
    }
}
