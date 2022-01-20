package ua.step.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Создать массив из 20 случайных чисел в диапазоне от -10 до 30. Написать
 * программу, определяющую сумму элементов массива, находящихся в массиве после
 * первого отрицательного элемента. Вывести на консоль полученный массив и
 * сумму.
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
         Random r = new Random();
        int[] mas = new int[4];
        int s=0;

        for (int i = 0; i < mas.length; i++)
            mas[i] = r.nextInt(40)-10;
            System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i]<0){for (int p=i; p<mas.length; p++ )
            s=s+mas[p];}
        }
        System.out.print("Сумма элементов массива после первого отрицательногт индекса= "+s);

    }
}
