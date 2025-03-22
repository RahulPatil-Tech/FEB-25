package Assignment_04;

class Room{
    double length;
    double breadth;
    double height;
    Room(double l, double b, double h){
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
    double volume(){
        return length * breadth * height;
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public double getHeight(){
        return height;
    }
}
public class RoomDemo{
    public static void main(String[] args){
        Room room1 = new Room(10, 20, 30);
        Room room2 = new Room(20, 30, 40);
        System.out.println("Volume of room1 is: " + room1.volume());
        System.out.println("Volume of room2 is: " + room2.volume());
    }
}