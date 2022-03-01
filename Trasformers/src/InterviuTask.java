public class InterviuTask {
    public static void main(String[] args) {


      /*  *//*
        *
        * *
        * * *
        * * * *
        * * * * *      *//*
        System.out.println("* ");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");

        System.out.println("=========");
*/
        for(int i = 0; i< 4 ; i++){
            for(int j = 0 ;j<= i ; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


  /*
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
*/


        for (int i = 6; i>0; i--){
            for( int j = 0 ; j<i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


       //   5 5 5 5 5
       //   4 4 4 4
       //   3 3 3
       //   2 2
        //  1
        for (int i = 5; i>=1; i--){
            for(int j = 1; j<= i; j++){
                System.out.print(i  +  " ");
            }
            System.out.println(" ");
        }






    }
}
