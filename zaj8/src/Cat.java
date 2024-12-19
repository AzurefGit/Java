public class Cat extends Animal implements LoudAnimal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Mial Mial n");
    }

    @Override
    public void sayName() {
        System.out.println(name);;
    }
}
