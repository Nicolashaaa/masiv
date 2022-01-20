package ua.step.example.part0.array;

import java.util.Random;

/**
 * 
 * Использование for для перебора элементов массива (foreach)
 *
 */
public class Task09
{
    public static void main(String[] args)
    {

        // FIXME Объявите массив на 10 элементов типа int.
        // Заполните его случайными числами от -10 до 10 используя цикл for.
        // Выведите сумму элементов полученного массива используя цикл foreach.
        Random r = new Random();
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        { a[i]=r.nextInt(20)-10;
            System.out.print(a[i]+" "); }
        int s=0;

                for (int h:a)
                    s+=h;
        System.out.print("\nСумма элементов полученного массива = "+s);

    }
}
