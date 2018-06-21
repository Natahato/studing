package cycle_for_foeach;

public class SmthFor {

    public static void main(String[] args) {


//        int y = 0;
//        int k = 4;
//        while (k > 1) {
//
//            y = y + 1 / k;
//            k = k - 1;
//
//            System.out.println("y " + y);
//            System.out.println("k " + k);
//
//        }
//    }

//        int y = 0;
//        int k = 3;
//        do {
//            k = k * 2;
//            y = y + k;
//        }
//        while (k < 7);
//
//        System.out.println("y = " + y);
//        System.out.println("k = " + k);

       int a = 1;

        int b = 1;

        int result;

        for(int i = 3; i<=11; i++){

            result = a + b;

            a=b;

            b=result;

            System.out.println(result);

        }






    }
}
