package Lesson_1;
/*
Урок 1. Знакомство с языком программирования Java
Написать программу вычисления n-ого треугольного числа. url
 */

import java.util.Scanner;

public class program {
    public static void main (String args[]) {
        try (Scanner in = new Scanner(System.in)){
          System.out.print("Введите целое положительное число :  ");
          int n = in.nextInt();
          int triang = n * (n + 1) / 2;
          System.out.print(triang);
        }
        
    }
    
}