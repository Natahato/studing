package workers;

public class WorkerWithFixSalary extends CoWorkers {

    double salaryMonth = 3000.0;

    public WorkerWithFixSalary(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    public void printSalary() {
        System.out.println("Salary of this month is " + salary);
    }
}
