package overriding;

public class B extends A{
//      overriding the method of parent
//    void doSomething() {
//        System.out.println("I'm B");
//    }


    @Override
    void doSomething() {
        // will call parent class method doSomething
        super.doSomething();
        System.out.println("I'm B");
    }
}
