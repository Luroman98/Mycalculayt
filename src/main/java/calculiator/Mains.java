package calculiator;

import java.util.Scanner;

public class Mains {
    public static void main(String[] args)throws Exception{
        Scanner in = new Scanner(System.in);

        System.out.println("Введите выражение");
        String a1 = in.nextLine();

        Strokaa obj = new Strokaa(a1);
        int cl = obj.razbienie();

        int[] aa = new int [2];

        if (cl == 3)
            obj.proverka();

    }
}
