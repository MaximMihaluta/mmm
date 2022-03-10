package car.com;

public class Car {
    double engine = 2.5;
    int seats = 4;
    int wheel = 4;
    public String color = "red";
    public double price = 35000.00;
    String interior = "white";
    boolean isElectric = false;
    String model = "Golf";
    String make = "VW";

    public void drive(){
        System.out.println(make + " " + model  + "  is driving");
    }
    public void strartEngine (){
        System.out.println(make + " " + model + " stop engine");
    }
    public void brokenDown(){
        System.out.println(make + " " + model + " is broken");

    }
    public void honk(){
        System.out.println(make + " " + model + " is beep beeping");

    }



}
