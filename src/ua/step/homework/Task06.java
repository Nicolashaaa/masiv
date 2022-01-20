package ua.step.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Заполните двухмерный массив размерностью NxM случайными числами и построчно
 * перенесите эти числа в одномерный массив. Вывести исходный массив и
 * полученные масcивы. 
 * Пример: 
 * исходный двумерный [[10, 48, 16], [61, 21, 1], [24, 84, 22], [24, 11, 27]] 
 * результат [10, 48, 16, 61, 21, 1, 24, 84, 22, 24, 11, 27]
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int n = args.length > 1 ? Integer.valueOf(args[0]) : 3;
        int m = args.length > 1 ? Integer.valueOf(args[0]) : 4;
        int[][] source = new int[m][n];
        System.out.println(Arrays.deepToString(source));
        int[] target = new int[m * n];
        System.out.println(Arrays.toString(target));
    }
}
