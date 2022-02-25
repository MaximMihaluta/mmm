public class Methods {
    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("hello2");

        //calling the method
        printText();
        printNumber();
        prinName("john");

        System.out.print("Hello   ");
        pName("MAX");
    }
    //outside the main methode
    //creating methodeee

    public static void printText(){
        System.out.println("hello3");
    }
    public static void printNumber(){
        System.out.println(2022);
    }
    public  static void prinName(String name){
        System.out.println(name);
    }
    // crate a methode String paramntr as name and print "Hello"
    // "Joh"
    public static void pName (String nm){
        System.out.println(nm);

    }


}
