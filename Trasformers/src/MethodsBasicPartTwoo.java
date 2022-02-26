import java.time.LocalDate;

public class MethodsBasicPartTwoo {
    public  static void addTwoNumbers (int x, int y){
        System.out.println(x + y);
    }
    void addThreeNumbers (int x, int y, int z){
        System.out.println(x + y + z);
    }
    int returnAge(int age){
        // before return
        return age;
        // we can not have any code after return
    }

    void clickB (String locator){
        System.out.println(locator + "button clicked");
    }
    void addNameEm (int age,String name , char email){
        System.out.println(age + name + email);
    }
    int multipl (int r,int t){
       int result =  r * t;
       return result;
    }
    boolean pageTitle (String title){
        if(title.equals("Welcome page")){
            return true;
        }else{
            return false;
        }
    }
    String printName (String name){
        return name;
    }
    LocalDate date = LocalDate.now();


    int calculatett(int birthYear){
        return date.getYear() - birthYear;
    }






    public static void main(String[] args) {
        addTwoNumbers(10, 20);
        addTwoNumbers(30, 40);
        MethodsBasicPartTwoo obj = new MethodsBasicPartTwoo();
        obj.addThreeNumbers(10, 20, 30);
        int age =  obj.returnAge(45);
        System.out.println(age);

        obj.clickB(" Login");

        obj.addNameEm(23,"Johm",'@');

        int rrr = obj.multipl(20,5);
        System.out.println(rrr);

        boolean ress = obj.pageTitle("Welcome page");
        System.out.println(ress);


        String name = obj.printName("John");
        System.out.println(name);



        int age2 = obj.calculatett(2013);
        System.out.println(age2);
        if (age2>= 18){
            System.out.println("you are allowed to buy beer");
        }else{
            System.out.println("you are not allowed");
        }



    }
}
