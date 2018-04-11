package kasting;

import org.junit.Test;

public class FashionShow {

//    int a = 5;
//    int b = a + 5;
//    int c = 10;

    String a = "aaa";
    String b = new String (a);


    @Test
    public void show() {
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
