public class MethodVoidReturn {
    public static void main(String[] args) {
        printText("this is void method");


        addAge(33,"John");


        System.out.println(printText2("this is return type method"));
    }
    //void == no return type
    public static void printText(String text){
        System.out.println(text);

    }
    //return type
    public static String printText2 (String text){

        System.out.println("Hello");
        return text;
    }
    public static void addAge(int age, String name){
        System.out.println(age + name);
    }




}
