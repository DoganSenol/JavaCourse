package day09;

import java.util.Scanner;

public class _08_JavaIf_Bonus {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle Giriniz = ");
        String cumle=oku.nextLine();

        cumle=cumle.toLowerCase();

        if (cumle .contains("a"))
        {
            System.out.println("Var");
        }
        if (!cumle.contains("a"))
        {
            System.out.println("Yok");
        }

        /* 2. YÖNTEM **/

        String aSızCumle =cumle.replace("A", "").replace("a", "");

        if (aSızCumle.length() == cumle.length())
        {
            System.out.println("YOK");
        }

        if (aSızCumle.length() != cumle.length())
        {
            System.out.println("VAR");
        }
    }
}
