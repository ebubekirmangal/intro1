import java.util.Scanner;

public class perfectN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mükemmel Sayı mı?");
        System.out.println("-----------------");
        System.out.print("Lütfen bir sayı giriniz: ");

        int perfectNum = scan.nextInt();
        int check = 0;

        for (int i = 1; i < perfectNum; i++) {
            if (perfectNum % i == 0) {
                check += i;
            } else {

            }
        }
        if (check == perfectNum) {
            System.out.println(perfectNum + " Mükemmel sayıdır.");
        } else {
            System.out.println(perfectNum + " Mükemmel sayı değildir.");
        }

        scan.close();
    }
}
