public class MyClass {

    //intsance variables //class members
    String name = "Bob";
    int age = 23;
    char gender = 'M';

    // class variables
    static String lastName = "Smith";
    static int birthYear = 1987;




    public static void main(String[] args) {


        // local variables
        int w = 24;

        MyClass sc = new MyClass();
        System.out.println(sc.lastName);
        sc.print(333);



        System.out.println(lastName + birthYear);
    }
    void print (int age ){
        String name = "John";
        System.out.println( name + gender);
    }
}

        class hello{

}