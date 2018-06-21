package cycle_for_foeach;

import org.junit.Test;

public class TernaryOperator {

    @Test
    public void operator() {
        int a = 5;
        int b = 4;
        int result;

        Boolean c = a < b;

        result = c ? 5 : 4;

        if (c == true) {
            System.out.println(result = 5);
        } else System.out.println(result = 4);

        System.out.println(result);

    }
}



