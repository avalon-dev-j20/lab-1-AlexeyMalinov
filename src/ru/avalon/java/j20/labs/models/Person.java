package ru.avalon.java.j20.labs.models;

import java.util.Objects;

/**
 * Представление о человеке.
 */
public class Person {
    /**
     * Имя.
     */
    private final String name;
    /**
     * Фамилия.
     */
    private final String surname;

    /**
     * Создаёт экземпляр класса на основании имени и даты
     * рождения.
     *
     * @param name    имя человека
     * @param surname дата рождения человека
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    public String getSurname() {
        return surname;
    }

    /**
     * {@inheritDoc}
     *
     * @param object
     * @return {@code true} , если этот объект совпадает с объектом аргумент;
     * {@code false} в противном случае.
     */
    @Override
    public boolean equals(Object object) {
        if (object instanceof Person) {
            Person other = (Person) object;
            return this.name.equals(other.name) && this.surname.equals(other.surname);
        }
        return false;
    }

    /**
     * {@inheritDoc}
     *
     * @return значение хеш-кода для этого объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
