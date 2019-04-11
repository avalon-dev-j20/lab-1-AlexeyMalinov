package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Person;

/**
 * Задание №4.
 *
 * <p>Тема: "Методы класса {@link Object}".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Person a = new Person("Иван", "Иванов");
        Person b = new Person("Иван", "Иванов");
        boolean isEqual = a.equals(b);
    }
}
