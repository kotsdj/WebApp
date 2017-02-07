package xyz.kots.webapp.Person;

/**
 * Created by kots on 07.02.2017.
 */
public class Dog implements Pet {
    private final Animal animal;

    public Dog(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return this.animal.getName();
    }
}
