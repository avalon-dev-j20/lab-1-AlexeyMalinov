package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Fibonacci;

import java.util.Iterator;

/**
 * Задание №3
 *
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {
        Fibonacci fibonacci = new Fibonacci(20);
        int sum = 0;
        for (int item : fibonacci) {
            sum += item;
        }
    }
}
