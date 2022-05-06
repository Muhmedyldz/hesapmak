import java.util.Scanner;

public class HesapMak1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("ilk sayiyi giriniz :");
        a= scan.nextInt();
        System.out.println("son sayiyi giriniz :");
        b= scan.nextInt();
        System.out.println("1-TOPLAMA\n2-CIKARMA\n3-CARPMA\n4-BOLME");
        System.out.println("Seciniz :");
        c= scan.nextInt();
        switch(c){
            case 1:
                System.out.print(a+b);
                break;
            case 2:
                System.out.print(a-b);
                break;
            case 3:
                System.out.print(a*b);
                break;
            case 4:
                System.out.print(a/b);
                break;
            default:
                System.out.print("gecersiz karekter girdiniz tekrar giriniz :");
                break;
        }

    }
}