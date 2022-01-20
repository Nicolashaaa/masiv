package ua.step.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Создать массив из 200 случайных чисел в диапазоне от 0 до 200. Определить
 * количество одноразрядных, двухразрядных и трёхразрядных чисел. Вывести на
 * консоль полученный массив и количество в процентах по разрядам.
 *
 */
public class Task03 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mas = new int[200];
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(200);
            if (mas[i] <= 9) s1++;
            else if (mas[i] <= 99) s2++;
            else s3++;
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("количество одноразрядных чисел "+s1+", двухразрядных чисел "+s2+" и трёхразрядных чисел "+s3);
    }
}

