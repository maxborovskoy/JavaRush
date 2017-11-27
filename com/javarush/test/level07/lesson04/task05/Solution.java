package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] main = new int[20];
        int[] half1 = new int[10];
        int[] half2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<20; i++) {
            main[i] = Integer.parseInt(reader.readLine());
        }

        System.arraycopy(main, 0, half1, 0, 10);
        System.arraycopy(main, 10, half2, 0, 10);

        for (int x: half2)
        {
            System.out.println(x);
        }
    }
}
