public interface LoudAnimal {
    //public abstract domyślne
    static int tysiac = 1000;
    void makeSound();
    //nie abstrakcyjne
    default void sayName(){
        System.out.println("Nie wiam jak się nazywam");
    }
}
