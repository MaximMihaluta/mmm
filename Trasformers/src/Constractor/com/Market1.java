package Constractor.com;

public class Market1 {
    String name;
    double price;
    double weight;

    public Market1(){

    }
    public Market1(String name){

    }
    public Market1(String name,double price){

    }
    public Market1(String name,double price , double weight){

        this.name = name;
        this.price = price;
        this.weight = weight;


    }

    public static void main(String[] args) {


        Market1 mk = new Market1("rice",45.00,44.44);


        System.out.println(mk.name);
        System.out.println(mk.price);
        System.out.println(mk.weight);






    }

}
