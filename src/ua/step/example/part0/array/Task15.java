package ua.step.example.part0.array;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Нахождение максимального и минимального значения в массиве
 *
 */
public class Task15
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = rnd.nextInt(40);
        }
        System.out.println(Arrays.toString(mas));

        // минимальное значение из диапазона
        int max = Integer.MIN_VALUE;
        for (int value : mas)
        {
            if (max < value)
            {
                max = value;
            }
        }
        System.out.printf("Maximum: %,d", max);
        
        // FIXME найди минимальное значение в массиве
        int min = Integer.MAX_VALUE;
        for (int value : mas) {
            if (min > value) {
                min = value;
            }
        }
            System.out.printf("\nMinimum: %,d", min);

    }
}