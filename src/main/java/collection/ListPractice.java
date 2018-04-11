package collection;

import org.junit.Test;
import workers.WorkerWithFixSalary;

import java.util.*;

import static java.util.Collections.sort;

public class ListPractice {

    @Test
    public void testList() {

        List<Integer> listNumber = new ArrayList();
        //
        listNumber = new LinkedList<Integer>();

        ArrayList<Integer> list = new ArrayList();

        listNumber.add(9);
        listNumber.add(15);
        listNumber.add(23);
        listNumber.add(2, 99);

        System.out.println(listNumber.get(2));

        listNumber.remove(1);

        System.out.println(listNumber);

        sort(listNumber);
        System.out.println(listNumber);
        Collections.reverse(listNumber);
        System.out.println(listNumber);
    }

    @Test
    public void employee() {

        List<WorkerWithFixSalary> listEmployee = new ArrayList();

        WorkerWithFixSalary workerWithFixSalary = new WorkerWithFixSalary("Kostia", "Sichnenko", 65, 990.98);
        WorkerWithFixSalary workerWithFixSalary1 = new WorkerWithFixSalary("Devid", "Bekham", 42, 12987.34);
        WorkerWithFixSalary workerWithFixSalary3 = new WorkerWithFixSalary("Devid", "Bekham", 42, 500.00);

        listEmployee.add(workerWithFixSalary);
        listEmployee.add(workerWithFixSalary1);
        listEmployee.add(new WorkerWithFixSalary("Stepan", "Giga", 17, 2.66));
        listEmployee.add(workerWithFixSalary3);


        System.out.println(listEmployee.get(0).name);
        System.out.println(listEmployee.get(0).surname);


        sort(listEmployee);

        for (WorkerWithFixSalary workerWithFixSalary2 : listEmployee){
            if (workerWithFixSalary2.salary == 2.66 | workerWithFixSalary2.salary == 500.00){
                System.out.println(workerWithFixSalary2.salary);
            }
        }

//
//        for (int x = 0; x < listEmployee.size(); x++) {
//            System.out.println(listEmployee.get(x).name);
//
//        }
    }

}
