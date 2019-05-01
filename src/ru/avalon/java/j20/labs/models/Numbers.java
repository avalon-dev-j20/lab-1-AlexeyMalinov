package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {
    }

    /**
     * Возвращает сумму значений переданного массива.
     *
     * @param values массив чисел
     * @return сумма элементов массива
     */
    public static <E extends Number> double sum(E[] values) {
        double sum = 0;
        for (E value : values) sum += value.doubleValue();
        return sum;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param values массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static <E extends Number> double avg(E[] values) {

        return sum(values) / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param a перое значение
     * @param b второе значение
     * @return большее из двух значений
     */
    public static <E extends Number> E max(E a, E b) {

        return a.doubleValue() > b.doubleValue() ? a : b;
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param values массив значений
     * @return максимальное значение массива
     */
    public static <E extends Number> E max(E[] values) {
        E result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param a первое значение
     * @param b второе значение
     * @return меньшее из дух значений
     */
    public static <E extends Number> E min(E a, E b) {
        return a.doubleValue() < b.doubleValue() ? a : b;
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param values массив значений
     * @return минимальное значение массива
     */
    public static <E extends Number> E min(E[] values) {
        E result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return result;
    }
}
