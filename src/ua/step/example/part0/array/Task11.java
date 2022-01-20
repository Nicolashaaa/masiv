package ua.step.example.part0.array;

/**
 * 
 * Разбиение строки на масссив строк
 *
 */
public class Task11
{
    public static void main(String[] args)
    {
        String text = "Доказано официально: коты — это жидкость!";
        String[] tokens = text.split(" ");
        for (String token : tokens)
        {
            System.out.println(token);
        }
    }
}