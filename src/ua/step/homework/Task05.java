package ua.step.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * 
  Создать массив из 20 случайных чисел в диапазоне от -10 до 20. Определить
  максимальное количество подряд идущих положительных элементов, не прерываемых
  ни нулями, ни отрицательными числами. Вывести на консоль исходный массив и
  найденный фрагмент (числа через пробел).

 */
public class Task05
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(30)-10;
        }

        System.out.println(Arrays.toString(mas));



    }
}
