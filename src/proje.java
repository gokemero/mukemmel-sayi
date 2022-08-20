import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i==0){
        System.out.print("Bir sayı giriniz :");
        int a = input.nextInt();
        int bolen = 1;
        int top = 0;
        while(a>bolen){
            if(a%bolen == 0)top+=bolen;
            bolen++;

        }
        if(top==a) System.out.println(a+" Mükemmel sayıdır");
        else System.out.println(a+" Mükemmel sayı değildir");
    }
}}
