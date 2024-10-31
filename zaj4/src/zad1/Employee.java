package zad1;

public class Employee extends Person {
    public int salary;
    public Employee(String fistName, String lastName, int salary){
        super(fistName, lastName);
        this.salary = salary;

//        setFirstName(fistName);
//        this.lastName = lastName;
    }

    @Override
    public void przedstawSie() {
        //super.przedstawSie();
        System.out.println("Nazywam się " + getFirstName() +
                " " + getLastName() + " Zarabiam " + salary + " brutto");
    }
}
