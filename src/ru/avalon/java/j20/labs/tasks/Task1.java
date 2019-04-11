package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

import java.util.Arrays;

/**
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        int[] array = arrayFactory.getInstance(20);
        int min = Numbers.min(convertorIntArrayToIntegerArray(array));
        int max = Numbers.max(convertorIntArrayToIntegerArray(array));
        double avg = Numbers.avg(convertorIntArrayToIntegerArray(array));
    }

    /**
     * Конвертирует массив чисел типа int в массив объектов типа Integer
     * @param array
     * @return
     */
    private static Integer[] convertorIntArrayToIntegerArray(int[] array){
        Integer[] integersArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            integersArray[i] = Integer.valueOf(array[i]);
        }
        return integersArray;
    }
}
