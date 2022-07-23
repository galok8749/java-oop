package polymorphism;

import java.util.List;

public class Main {
    public static void changePasswordOfAllUsers(List<User> users) {
        for (User user: users) {
            user.changeEmail();

//            if(user instanceof Student) {
//                System.out.println("I'm a student");
//                // typecast user because we are sure at runtime
//                Student student = (Student) user;
//                student.changeBatch();
//            }

//            bug code because user is of type mentor but we typecast to student
//            if(user instanceof Mentor) {
//                Student student = (Student) user;
//            }
        }
    }
    public static void main(String[] args) {

        User user = new TA();
//        user.expertise = "JAVA"; throws error
        User user1 = new Student();
        User user2 = new Mentor();
        User user3 = new User();

        List<User> users = List.of(
                user1,
                user2,
                user3,
                user,
                new Student(),
                new Mentor()
        );

        changePasswordOfAllUsers(users);
    }
}
