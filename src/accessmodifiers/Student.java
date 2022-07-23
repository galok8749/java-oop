package accessmodifiers;

public class Student {
    int age;
    String name;
    private String address = "scalerverse";
    public String email;
    String batch;
    double psp;
    String state;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Student() {

    }
    // copy constructor make parameter name as other
    Student(Student other) {
        name = other.name;
        address = other.address;
        batch = other.batch;
        email = other.email;
        psp = other.psp;
        state = other.state;
    }
    void changeBatch(String newBatch) {
        this.batch = newBatch;
    }

    void pauseCourse() {
        this.state = "PAUSED";
    }

    void karthik() {
        System.out.println("Kartik");
    }
}
