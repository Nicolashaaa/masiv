package ua.step.example.part2.arrays;

import java.util.Arrays;

/**
 * 
 * Копирование значений из одного массива в другой System.arraycopy
 * 
 */
public class Task04
{
    public static void main(String[] args)
    {
        int[] src = new int[] { 1, 2, 3, 4, 5 }; // источник
        int[] dest = new int[] { 5, 4, 3, 2, 1 }; // приемник
        int lenght = 2; // количество копируемых элементов
        int srcIndex = 1; // начальный индекс в источнике
        int destIndex = 2; // начальный индекс вставки в приемнике
        // копирование значения из одного массива в другой
        System.arraycopy(src, srcIndex, dest, destIndex, lenght);
        System.out.println(Arrays.toString(dest));

        // копирование значений из одной части массива в другую
        System.arraycopy(src, srcIndex, src, destIndex, lenght);
        // System.out.println(Arrays.toString(dest));
        //FIXME исправь значение перменных чтобы выводилось [5, 4, 3, 4, 5]
    }
}