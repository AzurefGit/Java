//package zad5;
//
//import zad4.Vehicle;
//
//import java.util.Arrays;
//import java.util.Objects;
//
//public class Results {
//    private String firstName;
//    private String lastName;
//    private int[] results;
//
//    public Results(String firstName, String lastName, int results) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.results = new int[size];
//    }
//
//    public String getFirstName(){ return firstName; }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int[] getResults() {
//        return results;
//    }
//
//    public void addResult(int index, int result){
//        results[index] = result;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Results{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", results=" + Arrays.toString(results) +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Results results1 = (Results) o;
//        return Objects.equals(firstName, results1.firstName) && Objects.equals(lastName, results1.lastName) && Arrays.equals(results, results1.results);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(firstName, lastName);
//        result = 31 * result + Arrays.hashCode(results);
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle("Subaru", "FromFuture", 2222);
//        Vehicle v2 = new Vehicle("Fiat", "125p", 1950);
//        Vehicle v3 = new Vehicle("Audi", "A4", 2000);
//
//        System.out.println(v2);
//    }
//}
