package abstractclasses;

public class Instructor extends User {
    private String assignedBatch;
    private String description;

    Instructor() {
        super("Instructor");
    }
    public String getAssignedBatch() {
        this.setName("Naman");
        return assignedBatch;
    }

    public void setAssignedBatch(String assignedBatch) {
        this.assignedBatch = assignedBatch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    void saySomething() {
        System.out.println("Solve your assignments");
    }

    //    Question: if I create an object of child class
//    Do private attributes of parent class take memory in that object?
//    class A {
//      private int a;
//      public int b;
//    }
//    class B extends A {
//       public int c;
//    }
//    B b = new B();
//    B's memory will have {a, b, c}
}
