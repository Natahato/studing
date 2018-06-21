package methods_class_string;

public class MethodString {

    public static void main(String[] args) {

        String str1 = new String("Aloha");

        String str2 = "Aloha";

        System.out.println(str1.charAt(0));
        System.out.println(str1.codePointAt(1)); //повертає   unicode
        System.out.println(str1.compareTo(str2)); //якщр строки рівні метод повертає 0
        System.out.println(str1.compareToIgnoreCase(str2)); //якщр строки рівні метод повертає 0, без врахування ругістру
        System.out.println(str1.concat(str2)); // те саме як srt1 + srt2
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str1.indexOf(65));
        System.out.println(str1.isEmpty());
        System.out.println(str1.length());

        String [] strings = str1.split(" ");
        for (String element: strings){
            System.out.println(element);
        }

        System.out.println(str1.substring(1, 4));


    }
}
