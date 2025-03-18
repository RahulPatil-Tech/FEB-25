class BMW {
    public void showDetails() {
        System.out.println("This is a BMW vehicle.");
    }

    public void maxSpeed() {
        System.out.println("Speed varies by model.");
    }
}

class BMWSeries3 extends BMW {
    public void showDetails() {
        System.out.println("This is a BMW Series 3.");
    }
    public void maxSpeed() {
        System.out.println("Max speed of BMW Series 3 is 240 km/h.");
    }
}
class BMWSeries5 extends BMW {
    public void showDetails() {
        System.out.println("This is a BMW Series 5.");
    }
    public void maxSpeed() {
        System.out.println("Max speed of BMW Series 5 is 260 km/h.");
    }
}
class BMWSeries7 extends BMW {
    @Override
    public void showDetails() {
        System.out.println("This is a BMW Series 7.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed of BMW Series 7 is 300 km/h.");
    }
}

public class BMWTest {
    public static void main(String[] args) {
        BMW[] vehicles = new BMW[3];
        vehicles[0] = new BMWSeries3();
        vehicles[1] = new BMWSeries5();
        vehicles[2] = new BMWSeries7();
        for (BMW vehicle : vehicles) {
            vehicle.showDetails();
            vehicle.maxSpeed();
            System.out.println();
        }
    }
}
