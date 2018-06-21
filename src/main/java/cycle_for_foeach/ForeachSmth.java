package cycle_for_foeach;

public class ForeachSmth {


    public static void main(String[] args) {
        int[] name = new int[5];
        name[0] = 10;

        String[] strings = new String[3];
        strings[0] = "Good";
        strings[1] = "Morning";
        strings[2] = "Java";

        for (int i = 0; i > strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (String string : strings) {
            System.out.println(string);
        }
        int[] name1 = {1, 2, 3};
        int sum = 0;
        for (int nam : name1) {
            sum = sum + nam;
            System.out.println(sum);
        }

    }

}
