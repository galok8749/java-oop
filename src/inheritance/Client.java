package inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
//        instructor.name = "Naman";
        instructor.setName("Naman");
//        instructor.description = "Super Cool";
        instructor.setDescription("Super Cool");
        instructor.saySomething();
        User user = new User();
//        user.name = "Karthik";

        Mentor mentor = new Mentor();
//        mentor.name = "Abhimanyu";
//        mentor.description = "Boss";
//        mentor.email = "abhimanyu@scaler.com";
    }
}
