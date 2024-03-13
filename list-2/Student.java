public class Student {
    String name;
    int rn;

    public Student(String name, int rn) {
        this.name = name;
        this.rn = rn;
    }

    public static void printStudentDetails(Student student) {
        System.out.println("Student name :: " + student.name);
        System.out.println("Roll Number :: " + student.rn);
    }

    public static void main(String[] args) {
        Student obj = new Student("Prince", 32);
        printStudentDetails(obj);
    }
}