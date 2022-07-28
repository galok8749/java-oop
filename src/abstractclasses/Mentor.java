package abstractclasses;

import java.util.List;

public class Mentor extends User {
    private List<Student> mentees;
    private String description;

    Mentor() {
        super("mentorType");
    }
    @Override
    void saySomething() {
        System.out.println("Reschedule the session");
    }
}
