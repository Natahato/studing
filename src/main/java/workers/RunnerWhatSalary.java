package workers;

public class RunnerWhatSalary {

    public static void main(String[] args) {

        WorkerWithFixSalary workerWithFixSalary = new WorkerWithFixSalary("Костя ", "Sichenko", 22, 3000.0);

        WorkerWithDallySalary workerWithDallySalary = new WorkerWithDallySalary("Petro", "Giga", 34, 15.00);

        workerWithDallySalary.printCoWorkers();
        workerWithDallySalary.calculateDallySalary();
        workerWithDallySalary.calculateDallySalary(workerWithDallySalary.salary);

        workerWithFixSalary.printCoWorkers();
        workerWithFixSalary.printSalary();


        System.out.println(workerWithDallySalary.name);
    }
}
