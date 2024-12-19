import java.util.ArrayList;

public class Butterfly extends Animal implements LoudAnimal{
    public Butterfly(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Flap flap");  // Butterfly sound
    }

    @Override
    public void sayName() {
        System.out.println(name);  // Print the butterfly's name
    }


        public static void main(String[] args) {
            // Create an ArrayList of LoudAnimal objects
            ArrayList<LoudAnimal> animals = new ArrayList<>();
            animals.add(new Cat("Bonifacy"));
            animals.add(new Dog("Reksio"));
            animals.add(new Butterfly("Paź"));

            // Iterate through the animals and call makeSound and sayName
            for (LoudAnimal animal : animals) {
                animal.makeSound();  // Call makeSound from LoudAnimal
                animal.sayName();    // Call sayName from LoudAnimal
            }
        }
    }
//Wiktor