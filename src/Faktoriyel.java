import java.util.Scanner;

public class Faktoriyel {  public static void main(String[] args) {
         /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720
       */
    Scanner scan = new Scanner(System.in);
    System.out.println("Lütfen bir bir dogal sayi giriniz");
    int input= scan.nextInt();
    int output=1;// carpmanin etkisiz elemani olmali cunku faktroriyel alacagiz

    for (int i = 1; i<=input; i++) {
        output *=i;
    }
    System.out.println("output----> "+output);

}
}
