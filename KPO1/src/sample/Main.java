package sample;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while(!dataCompare(dataInput())); //Запускаем цикл, для которого условием выхода является верно введенная строка.
    }

    public static String dataInput() //Метод для ввода строки в консоль.
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String userPassword = sc.nextLine();

        return userPassword;
    }

    public static boolean dataCompare(String userPassword) //Метод для сравнения введённой строки и строки-образца.
    {
        String password = "Pa$$w0rd";
        if (password.equals(userPassword)){ System.out.println("Пароли совпадают."); return true; }
        else{ System.out.println("Пароли не совпадают. Повторите попытку.\n"); return false; }
    }
}
