package alinaCalculator;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculater {
    public static int convert(String a) {

        if (a.equals("I")) return 1;
        if (a.equals("II")) return 2;
        if (a.equals("III")) return 3;
        if (a.equals("IV")) return 4;
        if (a.equals("V")) return 5;
        if (a.equals("VI")) return 6;
        if (a.equals("VII")) return 7;
        if (a.equals("VIII")) return 8;
        if (a.equals("IX")) return 9;
        if (a.equals("X")) return 10;
        if (a.equals("1")) return 1;
        if (a.equals("2")) return 2;
        if (a.equals("3")) return 3;
        if (a.equals("4")) return 4;
        if (a.equals("5")) return 5;
        if (a.equals("6")) return 6;
        if (a.equals("7")) return 7;
        if (a.equals("8")) return 8;
        if (a.equals("9")) return 9;
        if (a.equals("10")) return 10;
        return 0;
    }


    public static void main (String[] args) {


        System.out.println("Введите два целых числа от 1 до 10 через пробел (арабскими либо римскими цифрами в формате 1+1):");
        Scanner scanner=new Scanner(System.in);
       String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String[] chisla = scanner.nextLine().split(" ");
        String op= chisla[1];
        String a1=chisla[0];
        String b1=chisla[2];
        for (int i=0; i< roman.length; i++ ){ // не получилось(
            if (((a1!=roman[i]) && (b1==roman[i]))|| ((a1==roman[i]) && (b1!=roman[i]))){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("можно прибавлять либо только римские либо только арабские цифры");
                }
            }}


        int a=convert(a1);
        int b=convert(b1);
        //int a = Integer.parseInt(chisla[0]);
        //int b = Integer.parseInt(chisla[2]);
        if ((a<1 || a>10) ||  (b<1 || b>10)){
           System.out.println("число должно быть от 1 до 10");
        }
        else {


        switch (op){
            case "+":
                int summa= a+b;

                System.out.println(summa);

                break;
            case "-":
                int raznost= a-b;
                System.out.println(raznost);
                break;
            case "*":
                int umnozenie= a*b;
                System.out.println(umnozenie);
                break;
            case "/":
                int delenie= a/b;
                System.out.println(delenie);
                break;
            default:
                System.out.println("вы ввели неверный символ");
        }}}}
















