package ua.step.homework.test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.step.homework.Task06;

public class TaskTest06
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams()
    {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams()
    {
        System.setOut(null);
    }

    @Test
    public void testSourceLenght()
    {
        Task06.main(new String[] { "3", "4" });
        String rezult = outContent.toString();
        int start = rezult.indexOf("[[");
        int end = rezult.lastIndexOf("]]");
        String masString = rezult.substring(start, end + 2);
        String[] elements = masString.split(", ");
        assertTrue("Elements should be 20", elements.length == 9);
    }

    @Test
    public void testTarget()
    {
        Task06.main(new String[] { "3", "4" });
        String rezult = outContent.toString();
        int start = rezult.indexOf("]]");
        int end = rezult.lastIndexOf("]");
        String masString = rezult.substring(start + 5, end);
        String[] targetElements = masString.split(", ");
        start = rezult.indexOf("[[");
        end = rezult.lastIndexOf("]]");
        String sourceString = rezult.substring(start + 2, end);
        String[] sourceElements = sourceString.split(",");
        for (int i = 0; i < sourceElements.length; i++)
        {
            sourceElements[i] = sourceElements[i].replace("[", "");
            sourceElements[i] = sourceElements[i].replace("]", "");
            sourceElements[i] = sourceElements[i].trim();
        }
        assertTrue(Arrays.equals(sourceElements, targetElements));
    }
}