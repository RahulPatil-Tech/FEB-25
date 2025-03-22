package Assignment_04;
import java.util.Scanner;
class BMICalculator {
    private double height;
    private double weight;
    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }
}

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        BMICalculator bmiCalculator = new BMICalculator(height, weight);
        double bmi = bmiCalculator.calculateBMI();
        System.out.println("Your BMI is: " + bmi);
        scanner.close();
    }
}
