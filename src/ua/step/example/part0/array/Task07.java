package ua.step.example.part0.array;

/**
 * 
 * Использование for для перебора элементов массива (foreach)
 *
 */
public class Task07
{
    public static void main(String[] args)
    {
        // инициализация массива
        int[] ages = new int[] { 18, 35, 24, 46 };

        // вывод значений элементов массива с помошью цикла foreach
        System.out.println();
        for (int age : ages)
        {
            System.out.print(age + " ");
        }
        System.out.println();
     
    }
}
