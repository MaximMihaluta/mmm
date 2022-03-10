package car.com.vw;

import car.com.Car;

public class VWGolf {
    public static void main(String[] args) {
        Car golf = new Car();
        golf.strartEngine();
        golf.drive();

        String newColor = golf.color = "green";


        System.out.println(golf.color);
        System.out.println(golf.price);
    }
}
