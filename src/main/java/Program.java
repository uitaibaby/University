public class Program {
    public static void main(String[] args) {
        Student student = new Student("Igor", "7", 3, 4);
        University VGU = new University("11", "GosUniversitet", "VGU", 123,
                University.StudyProfile.radioman);
        System.out.println(student);
        System.out.println(VGU);
    }
}
