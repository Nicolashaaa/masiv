package ua.step.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * 
 * Создать массив из 100 случайных чисел в диапазоне от - 300 до 555. Написать
 * программу, копирующую один массив в другой следующим образом: сначала
 * копируются последовательно все элементы, большие 0, затем последовательно все
 * элементы, равные 0, а затем последовательно все элементы, меньшие 0. Вывести
 * исходный массив. Вывести результирующий массив.
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        int[]mas2=new int[100];
                Random r = new Random();
        int[] mas = new int[100];
        int s=0;
        for (int i = 0; i < mas.length; i++)
            mas[i] = r.nextInt(855) - 300;
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i]<0){mas2[s]=mas[i]; s++;}
        }
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i]==0){mas2[s]=mas[i]; s++;}
        }
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i]>0){mas2[s]=mas[i]; s++;}
        }

        System.out.print(Arrays.toString(mas2));

    }
}
