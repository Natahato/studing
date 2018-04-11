package collection;

import org.junit.Test;
import workers.WorkerWithFixSalary;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    @Test
    public void mapTest() {

        Map<Integer, String> mapTest = new HashMap<>();

        mapTest.put(54, "Kostia");
        mapTest.put(43, "Nataly");
        mapTest.put(22, "Stepan");

//        System.out.println(mapTest.get(54));

        for (Map.Entry<Integer, String> entry : mapTest.entrySet()) {
            if (entry.getValue() == "Nataly") {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }

    @Test
    public void mapStrong() {

        Map<String, WorkerWithFixSalary> fixSalaryMap = new TreeMap<>();

        fixSalaryMap.put("Eleks", new WorkerWithFixSalary("Kostia", "Sichenko", 19, 10000.00));
        fixSalaryMap.put("Salsa", new WorkerWithFixSalary("Alex", "Pyton", 22, 8000.00));

//        System.out.println(fixSalaryMap);

        for (Map.Entry<String, WorkerWithFixSalary> salaryEntry : fixSalaryMap.entrySet()){
            if (salaryEntry.getValue().age == 22){
                System.out.println(salaryEntry.getValue().age);

            }

        }
    }

}

