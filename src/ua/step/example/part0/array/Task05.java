package ua.step.example.part0.array;

/**
 * 
 * Получение значений из массива
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        int[] ages = new int[] { 18, 35, 24, 46, 88, 77};

        // получение значения элемента массива по индексу и присвоения в
        // переменную
        int a = ages[1];
        System.out.println("Значение элемента под индексом 1: " + a);

        // использование значений элементов массива в выражениях
        int average = (ages[0] + ages[1] + ages[2] + ages[3]) / ages.length;
        System.out.printf("средний возраст %d\n",  average);
        System.out.println(ages.length);
    }
}