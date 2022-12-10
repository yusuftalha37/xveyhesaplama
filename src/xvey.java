import java.util.Scanner;
public class xvey {
    public static void main(String[] args) {
        int x , y ;
        System.out.println("Lütfen deişkenkleri atayınız :");
        Scanner input =new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        int sonuç = 3*x+7/y;
        System.out.println("Sonucunuz : " + sonuç);


    }
}
