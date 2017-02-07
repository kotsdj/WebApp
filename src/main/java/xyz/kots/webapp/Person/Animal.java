package xyz.kots.webapp.Person;

/**
 * Created by kots on 07.02.2017.
 */
public class Animal implements Pet {
    private final String name;

    public Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
