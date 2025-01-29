package p8;

import java.util.Arrays;

public class Employee implements Cloneable{
    String name;
    double[] salaries = new double[12];

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaries=" + Arrays.toString(salaries) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.salaries = Arrays.copyOf(this.salaries, this.salaries.length);
        return cloned;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("Aab");

        for (int i = 0; i < employee1.salaries.length; i++) {
            employee1.salaries[i] = (i + 1) * 1000.0;
        }

        Employee employee2 = null;
        try{
            employee2 = (Employee) employee1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("N u s s...");;
        }
        employee2.salaries[5] = 6555.0;

        System.out.println(employee1);
        System.out.println(employee2);
    }

}
