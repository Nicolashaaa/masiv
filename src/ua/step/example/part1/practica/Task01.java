package ua.step.example.part1.practica;

/**
 * 
 * Задача "Синоптик"
 *
 */
public class Task01
{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String[] mounts = {"Январе", "Феврале", "Марте", "Апреле", "Майе", "Июне", "Июле", "Августе", "Сентябре",
                "Октябрь", "Нофябрь", "Декабрь"};

        // максимальная температура днем
        int[] dayMax = {-1, 1, 5, 12, 19, 24, 26, 26, 21, 15, 8, 4};

        /*
         * FIXME Написать программу, которая выведет название месяца с
         * максимальной средней температурой в году
         */
        int max = 0;
        for (int i = 0; i < dayMax.length; i++)
    if(dayMax[max]<dayMax[i]) max=i;
        System.out.println("Максимальная температура в "+mounts[max]);



        }

        // минимальная температура ночью
        int[] nightMin = { -10, -4, 0, 6, 12, 16, 18, 17, 13, 8, 3, -11 };

        /*
         * FIXME Написать программу, которая выведет название месяца, в котором
         * минимальная температура ночью
         */

    }
