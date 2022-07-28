package abstractclasses;

public class Student extends User {
    private String batch;
    private double psp;
    private Mentor mentor;

    Student() {
        super("studentType");
    }
    public String getBatch() {
        return batch;
    }

    public double getPsp() {
        return psp;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    @Override
    void saySomething() {

    }
}
