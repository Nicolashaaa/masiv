package ua.step.example.part3.multiarray;

import java.util.Arrays;

/**
 * 
 * Ступенчатые многомерные массивы и отложенная инициализация
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        // массив с отложеной инициализацией
        int[][] mas = new int[3][];
        // ошибка при выполнении (внутрение массивы еще не созданы)

        for (int i = 0; i < mas.length; i++)
        {
            // инициализация внутренего массива
            mas[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++)
            {
                mas[i][j] = j + 1;
            }
        }
        System.out.println(Arrays.deepToString(mas));
    }
}