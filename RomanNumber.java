import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num=sc.nextInt();
       Roman(num);
    }
    static void Roman(int num){

        while(num != 0)
        {

            if (num >= 1000)       // 1000 - m
            {
               System.out.print("M");
                num -= 1000;
            }

            else if (num >= 900)   // 900 -  cm
            {
               System.out.print("CM");
                num -= 900;
            }

            else if (num >= 500)   // 500 - d
            {
               System.out.print("D");
                num -= 500;
            }

            else if (num >= 400)   // 400 -  cd
            {
               System.out.print("CD");
                num -= 400;
            }

            else if (num >= 100)   // 100 - c
            {
               System.out.print("C");
                num -= 100;
            }

            else if (num >= 90)    // 90 - xc
            {
                System.out.print("XC");
                num -= 90;
            }

            else if (num >= 50)    // 50 - l
            {
                System.out.print("L");
                num -= 50;
            }

            else if (num >= 40)    // 40 - xl
            {
                System.out.print("XL");
                num -= 40;
            }

            else if (num >= 10)    // 10 - x
            {
                System.out.print("X");
                num -= 10;
            }

            else if (num >= 9)     // 9 - ix
            {
                System.out.print("IX");
                num -= 9;
            }

            else if (num >= 5)     // 5 - v
            {
                System.out.print("V");
                num -= 5;
            }

            else if (num >= 4)     // 4 - iv
            {
                System.out.print("IV");
                num -= 4;
            }

            else if (num >= 1)     // 1 - i
            {
                System.out.print("I");
                num -= 1;
            }

        }
    }
}
