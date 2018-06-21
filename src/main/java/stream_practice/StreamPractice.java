package stream_practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();

        // Створення стріма із значень

        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
        System.out.println("streamFromValues = " + streamFromValues.collect(Collectors.toList()));

        // Створення стріма із масиву

        String[] array = {"a1", "a2", "a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);
        System.out.println("streamFromArrays = " + streamFromArrays.collect(Collectors.toList()));

        // Створення числового стріма із строки

        IntStream streamFromString = "123".chars();
        System.out.print("streamFromString = ");
        streamFromString.forEach((e) -> System.out.print(e + " , ")); // надрукує streamFromString = 49 , 50 , 51 ,
        System.out.println();

        // З допомогою Stream.builder

        Stream.Builder<String> builder = Stream.builder();
        Stream<String> streamFromBuilder = builder.add("a1").add("a2").add("a3").build();
        System.out.println("streamFromBuilder = " + streamFromBuilder.collect((Collectors.toList())));

        // Створення нескінченних стрімів
        // З допомогою Stream.iterate

        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 2);
        System.out.println("streamFromIterate = " + streamFromIterate.limit(3).collect(Collectors.toList()));

        // З допомогою Stream.generate

        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
        System.out.println("streamFromGenerate = " + streamFromGenerate.limit(3).collect(Collectors.toList()));


        // Створити пустий стрім

        Stream<String> streamEmpty = Stream.empty();
        System.out.println("streamEmpty = " + streamEmpty.collect(Collectors.toList()));

        // Створити паралельний стрім із коллекції

        Stream<String> parallelStream = collection.parallelStream();
        System.out.println("parallelStream = " + parallelStream.collect(Collectors.toList()));
    }
}