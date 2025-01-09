package generic;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void djaGlos(){
        System.out.println("Szczek");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
