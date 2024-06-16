package alinaCalculator;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class Calculater {
    public static char convertChar(String o){
        if (o.equals("+")) return '+';
        if (o.equals("-")) return '-';
        if (o.equals("*")) return '*';
        if (o.equals("/")) return '/';
        return 0;

    }
    public static int convert(String a) {
        //try {

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
        if (a.equals("10")) return 10;//}
       //return 0;
       /* { try {
        throw new IOException();}
     catch (IOException e) {
        //throw new InputMismatchException("число должно быть от 1 до 10");
         System.out.println("число должно быть от 1 до 10");
    }*/
      return 0;}
    private static String arabToRoman (int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numArabian];
        return s;
    }


    public static void main (String[] args) {


        System.out.println("Введите два целых числа от 1 до 10 через пробел (арабскими либо римскими цифрами в формате 1+1):");
        Scanner scanner = new Scanner(System.in);
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabian = {"O", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String input = scanner.nextLine();
        String result1=calc(input);
        System.out.println(result1);

        //String[] chisla = scanner.nextLine().split(" ");
      /*  if (chisla.length!=3){try {
            throw new IOException();}
        catch (IOException e) {
            //throw new InputMismatchException("число должно быть от 1 до 10");
            System.out.println("ввести можно только два числа ");
        }
        }*/
       /* else {
        String op1 = chisla[1];
        String a1 = chisla[0];
        String b1 = chisla[2];
        *//*int a=convert(a1);
        int b=convert(b1);
        char op=convertChar(op1);*//*

        if ((Arrays.asList(roman).contains(a1)) && Arrays.asList(roman).contains(b1)){

            System.out.println(arabToRoman(result));
        }
        else if (((Arrays.asList(roman).contains(a1)) && Arrays.asList(arabian).contains(b1)) ||
                (Arrays.asList(arabian).contains(a1)) && Arrays.asList(roman).contains(b1) || (((a<1) || (a>10)) || ((b<1) || (b>10))) ) { try {
            throw new IOException();}
        catch (IOException e) {
            //throw new InputMismatchException("число должно быть от 1 до 10");
            System.out.println("числа должны быть либо арабскими, либо римскими (1+1) или (I+I) и в диапозоне от 1 до 10 ");
        }
        }

        else {



            System.out.println(result);}

    }*/}

public static String calc (String input){
    String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] arabian = {"O", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] chisla = input.split(" ");
    int result=0;
    if (chisla.length!=3){try {
        throw new IOException();}
    catch (IOException e) {
        //throw new InputMismatchException("число должно быть от 1 до 10");
        System.out.println("ввести можно только два числа ");
    }
    }
    else {
        String op1 = chisla[1];
        String a1 = chisla[0];
        String b1 = chisla[2];


        int a=convert(a1);
        int b=convert(b1);
        char op=convertChar(op1);

    switch (op) {
        case '+':
            result = a + b;
            if ((Arrays.asList(roman).contains(a1)) && Arrays.asList(roman).contains(b1)) {

                return (arabToRoman(result));
            } else if (((Arrays.asList(roman).contains(a1)) && Arrays.asList(arabian).contains(b1)) ||
                    (Arrays.asList(arabian).contains(a1)) && Arrays.asList(roman).contains(b1) || (((a < 1) || (a > 10)) || ((b < 1) || (b > 10)))) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    //throw new InputMismatchException("число должно быть от 1 до 10");
                    System.out.println("числа должны быть либо арабскими, либо римскими (1+1) или (I+I) и в диапозоне от 1 до 10 ");
                }
            }
            else
            return  Integer.toString(result);
            break;

        case '-':
            result = a - b;
            if ((Arrays.asList(roman).contains(a1)) && Arrays.asList(roman).contains(b1)) {

                return (arabToRoman(result));
            } else if (((Arrays.asList(roman).contains(a1)) && Arrays.asList(arabian).contains(b1)) ||
                    (Arrays.asList(arabian).contains(a1)) && Arrays.asList(roman).contains(b1) || (((a < 1) || (a > 10)) || ((b < 1) || (b > 10)))) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    //throw new InputMismatchException("число должно быть от 1 до 10");
                    System.out.println("числа должны быть либо арабскими, либо римскими (1+1) или (I+I) и в диапозоне от 1 до 10 ");
                }
            }
            else
                return  Integer.toString(result);
            break;
        case '*':
            result = a * b;
            if ((Arrays.asList(roman).contains(a1)) && Arrays.asList(roman).contains(b1)) {

                return (arabToRoman(result));
            } else if (((Arrays.asList(roman).contains(a1)) && Arrays.asList(arabian).contains(b1)) ||
                    (Arrays.asList(arabian).contains(a1)) && Arrays.asList(roman).contains(b1) || (((a < 1) || (a > 10)) || ((b < 1) || (b > 10)))) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    //throw new InputMismatchException("число должно быть от 1 до 10");
                    System.out.println("числа должны быть либо арабскими, либо римскими (1+1) или (I+I) и в диапозоне от 1 до 10 ");
                }
            }
            else
                return  Integer.toString(result);
            break;
        case '/':
            result = a / b;
            if ((Arrays.asList(roman).contains(a1)) && Arrays.asList(roman).contains(b1)) {

                return (arabToRoman(result));
            } else if (((Arrays.asList(roman).contains(a1)) && Arrays.asList(arabian).contains(b1)) ||
                    (Arrays.asList(arabian).contains(a1)) && Arrays.asList(roman).contains(b1) || (((a < 1) || (a > 10)) || ((b < 1) || (b > 10)))) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    //throw new InputMismatchException("число должно быть от 1 до 10");
                    System.out.println("числа должны быть либо арабскими, либо римскими (1+1) или (I+I) и в диапозоне от 1 до 10 ");
                }
            }
            else
                return  Integer.toString(result);
            break;



        default:
            System.out.println("вы ввели неверный символ");

    }

    }
    return  "";
    }}

        //int a = Integer.parseInt(chisla[0]);
        //int b = Integer.parseInt(chisla[2]);
     //  if ((a<1 || a>10) ||  (b<1 || b>10)){
     //      System.out.println("число должно быть от 1 до 10");
      // }
       // else {

       /* public static int calc (int a, int b, char op) {
            int result=0 ;
        switch (op){
            case '+':

                result= a+b;

                *//*if ((Arrays.asList(roman).contains(a1)) && Arrays.asList(roman).contains(b1)){

                    System.out.println(arabToRoman(result));
                   }
                else if (((Arrays.asList(roman).contains(a1)) && Arrays.asList(arabian).contains(b1)) ||
                (Arrays.asList(arabian).contains(a1)) && Arrays.asList(roman).contains(b1)) { try {
                    throw new IOException();}
                catch (IOException e) {
                    //throw new InputMismatchException("число должно быть от 1 до 10");
                    System.out.println("числа должны быть либо арабскими, либо римскими (1+1) или (I+I) ");
                }
                }

                else {



                System.out.println(result);}*//*

                break;
            case '-':
                 result= a-b;
                *//*if ((Arrays.asList(roman).contains(a1)) && Arrays.asList(roman).contains(b1)){
                    System.out.println(arabToRoman(result));
                }
                else if (((Arrays.asList(roman).contains(a1)) && Arrays.asList(arabian).contains(b1)) ||
                        (Arrays.asList(arabian).contains(a1)) && Arrays.asList(roman).contains(b1)) { try {
                    throw new IOException();}
                catch (IOException e) {
                    //throw new InputMismatchException("число должно быть от 1 до 10");
                    System.out.println("числа должны быть либо арабскими, либо римскими (1-1) или (I-I) ");
                }
                }
                else {
                System.out.println(result);}*//*
                break;
            case '*':
                 result= a*b;
              *//*  if ((Arrays.asList(roman).contains(a1)) && Arrays.asList(roman).contains(b1)){
                    System.out.println(arabToRoman(result));
                }
                else if (((Arrays.asList(roman).contains(a1)) && Arrays.asList(arabian).contains(b1)) ||
                        (Arrays.asList(arabian).contains(a1)) && Arrays.asList(roman).contains(b1)) { try {
                    throw new IOException();}
                catch (IOException e) {
                    //throw new InputMismatchException("число должно быть от 1 до 10");
                    System.out.println("числа должны быть либо арабскими, либо римскими (1*1) или (I*I) ");
                }
                }
                else {
                System.out.println(result);}*//*
                break;
            case '/':
                result= a/b;
               *//* if ((Arrays.asList(roman).contains(a1)) && Arrays.asList(roman).contains(b1)){
                    System.out.println(arabToRoman(result));
                }
                else if (((Arrays.asList(roman).contains(a1)) && Arrays.asList(arabian).contains(b1)) ||
                        (Arrays.asList(arabian).contains(a1)) && Arrays.asList(roman).contains(b1)) { try {
                    throw new IOException();}
                catch (IOException e) {
                    //throw new InputMismatchException("число должно быть от 1 до 10");
                    System.out.println("числа должны быть либо арабскими, либо римскими (1/1) или (I/I) ");
                }
                }
                else {
                System.out.println(result);}*//*
                break;
            default:
                System.out.println("вы ввели неверный символ");
        }  return result;
        }*///}
















