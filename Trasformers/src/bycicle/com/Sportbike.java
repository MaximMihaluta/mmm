package bycicle.com;

public class Sportbike {
    public static void main(String[] args) {


        bycicle sportBike = new bycicle();


        sportBike.wheel = 2;
        sportBike.color ="red";
        sportBike.price = 8000;
        sportBike.name = "BMW";
        sportBike.basket = false;
        sportBike.type = "BMW_5.7";


        System.out.println("Bike price is " + sportBike.price);

        sportBike.gear();
        sportBike.ride();

    }

}
