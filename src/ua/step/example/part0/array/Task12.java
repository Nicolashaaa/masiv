package ua.step.example.part0.array;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Установка значений элементов в цикле.
 *
 */
public class Task12
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = r.nextInt(99);
        }
        System.out.println(Arrays.toString(mas));
    }
}
// FIXME заполни массив случайными числами от 0 до 99