package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Alice");
        student.setGrade(85);

        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());

        student.setGrade(105);
        System.out.println("Invalid Grade (105) becomes: " + student.getGrade());
    }
}