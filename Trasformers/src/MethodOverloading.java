public class MethodOverloading {

    public static void main(String[] args) {

        addNumberss(20,40);
        addNumberss(30,40,33);
        addNumberss();
        dropDown("febr");
    }
    ///-------------------

    static void addNumberss(int x, int y){
        System.out.println(x+y);
    }
    static void addNumberss(int x, int y, int z){
        System.out.println(x + y + z);
    }
    static void addNumberss(int x, int y, int z, int a) {
        System.out.println(x + y + z + a);
    }
    static void addNumberss(){
        System.out.println("no paramentres");
    }
    static void dropDown (String name){
        System.out.println("months");

    }
    static void dropDown (int indez){
        System.out.println("1234");

    }
    static void dropDown (char option){
        System.out.println("months---12345");

    }
}
