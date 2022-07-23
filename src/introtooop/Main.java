package introtooop;

public class Main {
    public static void main(String[] args) {
        Student kartik = new Student();
        kartik.name = "Kartik";
        kartik.address = "scalerverse";
        kartik.state = "ACTIVE";
        kartik.pauseCourse();
        kartik.kartik();

        Student naman = new Student();
        naman.name = "Naman";
        naman.batch = "Best batch of Scaler";
        naman.kartik();
        System.out.println("Doing Nothing");
    }
}
