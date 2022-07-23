package polymorphism;

public class Mentor extends User{
    String company;
    String description;
    double rating;

    void removeMentee() {

    }

    @Override
    void changeEmail() {
        System.out.println("Changing email in Mentor");
    }
}
