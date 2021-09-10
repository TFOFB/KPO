package sample;

import java.util.List;
import java.util.Scanner;

public class Operations
{

    public int addNum()
    {
        Scanner sc = new Scanner(System.in);
        int newNum = 0;
        while (newNum == 0)
        {
            System.out.print("\nВведите целое число: ");
            if (sc.hasNextInt())
            {
                newNum = sc.nextInt();
            }
            else
            {
                System.out.println("\nВведённые данные некорректны.");
                newNum = 0;
                sc.nextLine();
            }
        }

        return newNum;
    }

    public void sumOfNum(List<Integer> nums)
    {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++) sum += nums.get(i);
        System.out.println("\nСумма введённых чисел = " + sum);
    }

    public void prodOfNum(List<Integer> nums)
    {
        int prod = 1;
        for(int i = 0; i < nums.size(); i++) prod *= nums.get(i);
        System.out.println("\nПроизведение введённых чисел = " + prod);
    }

}
