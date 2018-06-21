package exception;

public class ExceptionPractice {
    public static void main(String[] args) {

        int a = 4;

        try {
            System.out.println(a/0);

        } catch (Exception e) {
            a /= 4;
            System.out.println("Zero " + a);
        }

    }
}
