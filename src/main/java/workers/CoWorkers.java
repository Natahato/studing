package workers;

import java.util.Objects;

abstract class CoWorkers implements Comparable<CoWorkers> {

    public String name;
    public String surname;
    public int age;
    public double salary;

    CoWorkers (String name, String surename, int age, double salary){
        this.name = name;
        this.surname = surename;
        this.age = age;
        this.salary = salary;
    }

    CoWorkers () {
    }

    public void printCoWorkers (){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(salary);
    }

    public int compareTo(CoWorkers p){

        return surname.compareTo(p.name);
    }

    @Override
    public String toString() {
        return "CoWorkers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoWorkers coWorkers = (CoWorkers) o;
        return age == coWorkers.age &&
                Double.compare(coWorkers.salary, salary) == 0 &&
                Objects.equals(name, coWorkers.name) &&
                Objects.equals(surname, coWorkers.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, age, salary);
    }
}
