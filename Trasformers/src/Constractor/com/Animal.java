package Constractor.com;

public class Animal {

    public String animalname;
    public int animalage;
    public String fur;
    public String types;
    public double weight;
    public boolean canFly;

    // Constrructor same as class
/*
    public Animal() {
        name = "Lion";
        age = 3;
        fur = "yelow";
        types = "female";
        weight = 150;
        canFly = false;*/



  /*  public static void main(String[] args) {
        Animal lion = new Animal();
        System.out.println(lion.name);
        System.out.println(lion.age);
        System.out.println(lion.fur);
        System.out.println(lion.types);
        System.out.println(lion.weight);
        System.out.println(lion.canFly);*/



    public Animal(String name, int age, String fur, String types, double weight, boolean canFly) {



        animalname = name;
        animalage = age;
        fur = fur;
        types = types;
        weight = weight;
        canFly = canFly;
    }
}