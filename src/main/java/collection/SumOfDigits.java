package collection;

public class SumOfDigits {

    public static void main(String[] args) {

        String n = args[0];
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(n.charAt(i) + "");
        }
        System.out.println(sum);
    }
}



// Задача е

//        int[] num7 = {1, 3, 5, 2, 8, 9, 5, 0};
//        int x7 = num7[0];
//
//        for (int i = 0; i <= (num7.length - 1); i++) {
//            if (num7[i] < x7);
//            x7 = num7[i];}
//
//            System.out.println(x7);
//        }


