package constructor;

public class Main {
    public static void main(String[] args) {
        Student karthik = new Student("Karthik", "scalerverse");
        karthik.age = 18;
        karthik.state = "ACTIVE";
        karthik.pauseCourse();
        karthik.karthik();

        Student naman = new Student("naman", null);
        naman.batch = "Best batch of Scaler";
        naman.karthik();

        System.out.println("Doing Nothing");

        Student prakash = new Student();

        Student karthikCopy = new Student(karthik);
        System.out.println("random");

        System.out.println("------- Constructor Copy Same Values -------");
        System.out.println(karthik.age);
        karthikCopy.age = 21;
        System.out.println(karthik.age);
        System.out.println(karthik.name);
        System.out.println(karthikCopy.name);
        System.out.println(karthik.name);

//        System.out.println(karthikCopy.name);

    }
}
