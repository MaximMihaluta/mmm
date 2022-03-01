public class B {
    public static void main(String[] args) {
/*

        */
/*  *//*
*/
/* a obj = new a();
        obj.adTwoNu(20,30);*//*
*/
/*
        a.adTwoNu(100, 20);
        a.substrTwoNu(34, 55);*//*


        a.printUntil(10);
        a.printUntil(3);

        System.out.println();


        MethodsBasicPartTwoo ggg = new MethodsBasicPartTwoo();
        int www = ggg.calculatett(1998);
        System.out.println(www);
*/


        int[] num = {22, 33, 44, 55, 66};
      int result = findIdex(num,449);
        System.out.println(result);


    }

    static int findIdex(int[] numArr, int value) {
        int index = 0;
        if (numArr.length == 0) {
            return -1;
        }


        for (int i = 0; i < numArr.length; i++) {

            if (numArr[i] == value) {
                index = i;
                return  index;
            }

        }
        return index;

    }
}