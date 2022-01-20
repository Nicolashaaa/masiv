package ua.step.example.part2.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * Методы класса Arrays. Сортировка массива.
 * 
 */
public class Task02
{
    /**
     * Метод sort() из класса Arrays использует усовершенствованный алгоритм
     * Быстрой сортировки (Quicksort), который эффективен в большинстве случаев.
     */
    public static void main(String[] args)
    {

        String[] names = { "Аня", "Маня", "Глаша", "Юля" };
        // только для ссылочных типов
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println(Arrays.toString(names));

        Integer[] mas11 = new Integer[] { 3, 1, 4, 6, 2 };
        // сортировка чисел в обратном порядке, возможна только дла классов-оберток
        // примитивных типов
        Arrays.sort(mas11, Collections.reverseOrder());
        System.out.println(Arrays.toString(mas11));
    }
}