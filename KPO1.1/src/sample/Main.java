package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //создаем объект run для вызова методов из класса Operations
        Operations run = new Operations();

        List<Integer> nums = new ArrayList<Integer>();
        int cs = 0;

        System.out.println
                ("\nСписок команд:"+
                        "\n1. Добавить число" +
                        "\n2. Вывод суммы"+
                        "\n3. Вывод произведения"+
                        "\n4. Вывод меню программы"+
                        "\n5. Выход из программы");


        while (cs != 5){
            System.out.print("\nВыбор: ");
            cs = sc.nextInt();
            switch(cs){

                case 1: //кейс с добавлением нового числа
                    nums.add(run.addNum());
                    System.out.print("\nВведённые числа: ");
                    for(int i = 0; i < nums.size(); i++)
                    {
                        if(nums.size() != 1 & i + 1 != nums.size()) System.out.print(nums.get(i) + ", ");
                        else System.out.print(nums.get(i) + "\n");
                    }
                    cs = 0;
                    break;

                case 2: //кейс с суммой введённых чисел
                    run.sumOfNum(nums);
                    cs = 0;
                    break;

                case 3: //кейс с произведением введённых чисел
                    run.prodOfNum(nums);
                    cs = 0;
                    break;

                case 4: //кейс для вывода меню программы
                    System.out.println
                            ("\nСписок команд:"+
                                    "\n1. Добавить число" +
                                    "\n2. Вывод суммы"+
                                    "\n3. Вывод произведения"+
                                    "\n4. Вывод меню программы"+
                                    "\n5. Выход из программы");
                    cs = 0;
                    break;

            }
        }
    }
}
