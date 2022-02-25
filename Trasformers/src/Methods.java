public class Methods {
    public static void main(String[] args) {

    /*    System.out.println("hello");
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
        System.out.println(nm);*/

        adTwoNumber(20, 30);

        printFullName("Maxim FUla", "TURa");

        adTwoNumber(70, 77);


        findVowels("hello");
    }

    public static void printFullName(String firstt, String secondf) {
        System.out.println();
    }

    public static void adTwoNumber(int a, int b) {
        System.out.println(a + b);
    }

    public static void adTwoNum(double x, double y) {
        System.out.println(x + y);
    }

    public static void adTwoNumM(double x, double y) {
        System.out.println(x * y);
    }

    //  a i e
    public static void findVowels(String str){
        int countVowels = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) =='i'
                    || str.charAt(i) =='o' || str.charAt(i) =='u'
            ){
                countVowels++;

            }
                System.out.println("NO vowels");

        }
        System.out.println(countVowels);
    }

}
