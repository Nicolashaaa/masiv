package ua.step.example.part0.array;

import java.util.Arrays;

/**
 * 
 * Использование for для перебора элементов массива (foreach)
 *
 */
public class Task08
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // инициализация массива
        int[] ages = new int[] { 18, 35, 24, 46 };

        // foreach можно использовать только для чтения значений.
        for (int age=0; age< ages.length; age++)
        {
            // значение записано в копию элемента, а не в массив.
            // поэтому изменить значение элемента в массиве не получится
            ages[age] = age;
        }
        System.out.println(Arrays.toString(ages));
    }
}
