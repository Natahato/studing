package collection;

import org.junit.Test;
import workers.WorkerWithFixSalary;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

    @Test
    public void testSet() {

        Set<WorkerWithFixSalary> setNumbers = new TreeSet<>();

        setNumbers.add(new WorkerWithFixSalary("Ivan", "Ivanovych", 34, 9000.00));
        setNumbers.add(new WorkerWithFixSalary("Petro", "Petrovych", 89, 12456.00));

        System.out.println(setNumbers);


        for (WorkerWithFixSalary salary1 : setNumbers) {

            if (salary1.salary == 900.00) {
                System.out.println(salary1.salary);
            }

        }


    }
}
