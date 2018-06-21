package stream_practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamMaxMin {

    public int countNumber(List<Integer> integerList) {

        return integerList
                .stream()
                .max(Comparator.comparing(Integer::valueOf)).get();
    }

    @Test
    public void countNumber (){

        List<Integer> countN = new ArrayList<>();
        countN.add(90);
        countN.add(23);
        countN.add(56);
        System.out.println(countNumber(countN));
    }

    public Double countNumbers(List<Integer> integerList) {

        return integerList
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }

    @Test
    public void a (){

        List<Integer> b = new ArrayList<>();
        b.add(5);
        b.add(10);
        System.out.println(countNumbers(b));
    }

    public int minNumber (List <Integer> integerList){

        return integerList
                .stream()
                .min(Comparator.comparing(Integer ::valueOf)).get();
    }

    @Test
    public void minNumber (){

        List <Integer> minNum = new ArrayList<>();
        minNum.add(34);
        minNum.add(26);
        minNum.add(11);
        System.out.println(minNumber(minNum));

    }
}

