package ua.step.example.part0.array;

import java.util.Arrays;

/**
 * 
 * Массив строк
 * Установка и чтение значений элементов по индекусу.
 *
 */
public class Task10
{
    public static void main(String[] args)
    {
        String[] strings = new String[3];
        System.out.println(Arrays.toString(strings));
        strings[0] = "Васька"; // запись значения первого элемента
        strings[0] = "Мурзик"; // перезапись значения первого элемента
        strings[1] = "Сонька"; // запись значения второго элемента
        strings[2] = "Обормот"; // запись значения третьего элемента
         System.out.println(Arrays.toString(strings));

        char c = strings[1].charAt(3);
        System.out.println(c);
        // FIXME исправь пример, таким образом, чтобы он выводил мягкий знак
    }
}
