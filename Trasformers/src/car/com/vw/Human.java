package car.com.vw;

/*
public class Human {
    static String eat = "vegetables";
    static String speak = "english";
    static String walk = "straight";
    static String run = "fast";

    public static void main(String[] args) {

        System.out.println("Human can eat " + eat);

        System.out.println("Human can speak " + speak);

        System.out.println("Human can walk " + walk);
    }
*/


public class Human {
    //eat, speak, walk, talk, run
    static void eat(){
        System.out.println("Lunch");
    }

    static void walk(){
        System.out.println("walk");
    }

    static void speak(){
        System.out.println("speak");
    }

    static void talk(){
        System.out.println("talk");
    }

    static void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        eat();
        speak();
        talk();
        run();
        walk();
    }

}




