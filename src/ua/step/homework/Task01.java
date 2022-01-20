package ua.step.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Создать массив из 20 случайных чисел. Вывести на консоль полученный массив и
 * все элементы массива с чётными индексами через пробел . 
 * Пример 
 * [12, 12, 14, 14, 7, 1, 9, 0, 18, 19, 14, 8, 7, 15, 11, 0, 14, 18, 6, 0]
 * Результат 
 * 12 14 7 9 18 14 7 11 14 6
 *
 */
public class Task01 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(30);
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i = i + 2){
            System.out.print(mas[i]+" ");
        } ;


    }

}