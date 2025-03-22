package Assignment_05;
import java.util.Scanner;
import java.util.InputMismatchException;

class Student {
    String name;
    int rollNo;
    double[] marks = new double[5];
    double average;
    char grade;
    public Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        for (double mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Marks should be between 0 and 100.");
            }
        }
        this.marks = marks;
    }
    public void calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        this.average = total / marks.length;
    }
    public void calculateGrade() {
        if (average >= 90) {
            this.grade = 'A';
        } else if (average >= 80) {
            this.grade = 'B';
        } else if (average >= 70) {
            this.grade = 'C';
        } else if (average >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student's roll number: ");
            int rollNo = scanner.nextInt();
            double[] marks = new double[5];
            System.out.println("Enter marks for 5 subjects: ");
            for (int i = 0; i < 5; i++) {
                marks[i] = scanner.nextDouble();
            }
            Student student = new Student(name, rollNo, marks);
            student.calculateAverage();
            student.calculateGrade();
            student.displayStudentInfo();

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric data for roll number and marks.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
