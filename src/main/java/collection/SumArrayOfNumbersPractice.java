package collection;

public class SumArrayOfNumbersPractice {


    public static void main(String[] args) {

        int[] a = {1, 2, 5, 7, 3};
        int sum = 0;

        for (int i = 1; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum is " + sum);

    }


}


//    public static void main(String[] args) {
//        double a[] = {1, 2, 1, 2.5, 1};
//        double sum = 0;
//
//        for (double x : a) {
//            sum += x;
//        }
//        System.out.println("Sum is " + sum);
//    }
//}