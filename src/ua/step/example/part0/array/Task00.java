package ua.step.example.part0.array;

import java.util.Random;

/**
 * 
 * Псевдослучайные числа на основе класса Random
 * 
 */
public class Task00
{
    public static void main(String[] args)
    {
        Random rnd = new Random();


        // FIXME Выведите в строку через пробел 10 случайных чисел (используйте
        // цикл for)
        for(int i=0; i<10; ++i){
            System.out.print(rnd.nextInt(100)+" ");
        }

    }
}