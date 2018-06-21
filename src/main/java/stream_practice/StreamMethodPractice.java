package stream_practice;

import org.junit.Test;

import java.util.*;


public class StreamMethodPractice {

    @Test
    public void number (){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

    }

    @Test
    public void setNames() {

        List<String> names = Arrays.asList("John", "Ivan", "Taras", "Marry", "Nikolas");

        long count = names.stream()
                .filter(i -> i.length() > 4)
                .count();
        System.out.println(count);
    }

    @Test
    public void setName () {
        List<String> names = Arrays.asList("John", "Dasty", "Tarasito", "", null, "Anita");

        names.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty() && name.contains("a"))
                .forEach(System.out::println);
    }
}