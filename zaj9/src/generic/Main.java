package generic;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Filemon");
        Animal animal2 = new Animal("Burek");

        Box<Animal, Animal> box1 = new Box<>(animal, animal2);

        System.out.println(box1.get());
        System.out.println(box1.get2());
        String napis = "Cześć";
        Box<Animal, String> box2 = new Box<>(animal, napis);
        Box<String, Animal> box3 = new Box<>(napis, animal);

        //wypisz(napis);
        wypisz(animal);
    }

    public static <T extends Animal> void wypisz(T value){ //<T exteds> ogranicza
        System.out.println(value);
    }
}
