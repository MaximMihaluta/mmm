package Constractor.com;

public class Lion {


    public static void main(String[] args) {
     /*   Animal lion = new Animal();
        System.out.println(lion.name);
        System.out.println(lion.age);*/


        Animal lion2 = new Animal("Simba", 4 ,"DarkYelow", "Male", 120, false);

        System.out.println(lion2.animalname);
        System.out.println(lion2.animalage);

        Animal dog = new Animal("Rex", 4, "Brown", "male",54, false);
        Animal eagle = new Animal("Bobo" , 6, "Brown", "female", 46, true);

        System.out.println(eagle.animalname);
        System.out.println(eagle.animalage);
    }

}
