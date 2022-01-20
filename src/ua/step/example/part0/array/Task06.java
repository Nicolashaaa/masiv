package ua.step.example.part0.array;

/**
 * 
 * Чтение значение элементов массива.
 *
 */
public class Task06
{
    public static void main(String[] args)
    {
        int[] ages = new int[] { 18, 35, 24, 46 };

        // получение значения элемента массива по индексу и присвоения
        // результата в переменную a
        int index = 1;
        int age1 = ages[index];
        System.out.println(age1);
       
        // вывод значений элементов массива с помошью цикла for
        for (int i = 0; i < ages.length; i++)
        {
            System.out.printf("%d ", ages[i]);
        }
        System.out.println();
        System.out.println(ages); // для вывода элементов не годится
    }
}