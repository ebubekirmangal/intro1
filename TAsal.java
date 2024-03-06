import java.util.Scanner;

public class TAsal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayının asallığını kontrol edebilirsiniz. Bir Sayı giriniz: ");
        int thisNum = scan.nextInt();

        boolean asalMi = true;
        if (thisNum < 2) {
            System.out.println("En küçük asal sayı 2'dir.");
        } else {
            for (int i = 2; i < thisNum; i++) {
                if (thisNum % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.println(thisNum + " Sayısı asaldır.");
            } else {
                System.out.println(thisNum + " Sayısı asal değildir.");
            }

        }

        scan.close();
    }
}
