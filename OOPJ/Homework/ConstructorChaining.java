
class Vehicle {
    String type;

    Vehicle() {
        this("Unknown Vehicle");
        System.out.println("Vehicle default constructor called.");
    }

    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle parameterized constructor called with type: " + type);
    }
}

class Car extends Vehicle {
    String model;

    Car() {
        this("Generic Model");
        System.out.println("Car default constructor called.");
    }

    Car(String model) {
        this.model = model;
        System.out.println("Car parameterized constructor called with model: " + model);
    }

    Car(String type, String model) {
        super(type); 
        this.model = model;
        System.out.println("Car parameterized constructor called with type: " + type + " and model: " + model);
    }

}

public class ConstructorChaining {
    public static void main(String[] args) {
        Car car1 = new Car(); 
        System.out.println("Details of car1:");
        System.out.println("Type: " + car1.type + ", Model: " + car1.model);
                    
        System.out.println("--------------------");

        Car car2 = new Car("Sedan");
        System.out.println("Details of car2:");
        System.out.println("Type: " + car2.type + ", Model: " + car2.model); 
                                                                            
        System.out.println("--------------------");

        Car car3 = new Car("Electric", "Model X");
        System.out.println("Details of car3:");
        System.out.println("Type: " + car3.type + ", Model: " + car3.model);
                                                                            
        System.out.println("--------------------");
    }
}
