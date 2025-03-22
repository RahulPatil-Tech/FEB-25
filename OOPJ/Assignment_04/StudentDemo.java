package Assignment_04;
class Student {
    // Attributes
    String name;
    int marks1, marks2, marks3;

    // Method to assign initial values
    public void assignValues(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to compute total and average marks
    public void computeTotalAndAverage() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + String.format("%.2f", average));
    }

    // Method to display student's name and total marks
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        computeTotalAndAverage();
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student();

        // Assign values to the student object
        student1.assignValues("John Doe", 85, 90, 88);

        // Display student info
        student1.displayInfo();
    }
}
