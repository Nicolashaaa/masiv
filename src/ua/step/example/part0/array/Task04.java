package ua.step.example.part0.array;

/**
 * 
 * Инициализация в месте объявления
 *
 */
public class Task04
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // инициализация массива в месте объявления
        // обратите внимание, что размер в этом случае не указвается в квадратных
        // скобках
        int[] ages1 = new int[] { 18, 35, 24, 46 };

        // упрощенная форма инициализации массива в месте объявления
        int[] ages2 = { 18, 35, 24, 46 };
    }
}