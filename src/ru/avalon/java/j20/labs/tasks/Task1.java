package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

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
        int min = Numbers.min(convertIntArrayToIntegerArray(array));
        int max = Numbers.max(convertIntArrayToIntegerArray(array));
        double avg = Numbers.avg(convertIntArrayToIntegerArray(array));
    }

    /**
     * Конвертирует массив чисел типа int в массив объектов типа Integer
     *
     * @param array
     * @return массив объектов типа Integer
     */
    private static Integer[] convertIntArrayToIntegerArray(int[] array) {
        Integer[] integersArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            integersArray[i] = Integer.valueOf(array[i]);
        }
        return integersArray;
    }
}
