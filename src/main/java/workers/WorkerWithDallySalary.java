package workers;

public class WorkerWithDallySalary extends CoWorkers {

    WorkerWithDallySalary(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);

    }

    public void calculateDallySalary() {

        double monthSalary = 30 * 8 * this.salary;

        System.out.println("This month dally salary are " + monthSalary);
    }

    public void calculateDallySalary(double salaryDay) {

        double monthSalary = 30 * 8 * salaryDay;

        System.out.println("This month dally salary are " + monthSalary);
    }
}

