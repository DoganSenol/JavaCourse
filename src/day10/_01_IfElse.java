package day10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // If a student's grade entered is greater than or equal to 50, you have passed.
        // print out if it is small.

        Scanner oku = new Scanner(System.in);
        System.out.print("Enter the exam grade=");
        int examGrade = oku.nextInt();

        // 1.yöntem bilgisayar boş yere yoruluyor
        if (examGrade >= 50)
            System.out.println("successful");

        if (examGrade < 50)
            System.out.println("unsuccessful");

        // 2.yöntem olması gereken
        if (examGrade >= 50)
            System.out.println("successful");
        else // !(ogrNot >= 50)  değilse
            System.out.println("unsuccessful");


    }
}
