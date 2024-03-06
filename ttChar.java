import java.util.Scanner;

public class ttChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sesli Harf Konrol Uygulaması");
        System.out.println("----------------------------");

        System.out.print("Lütfen 1 tane sesli harf giriniz: ");
        String chart = scan.nextLine();
        String bigChar = chart.toUpperCase();

        switch (bigChar) {
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println(bigChar + " Sessiz Harftir.");
                break;
            case "E":
            case "İ":
            case "Ö":
            case "Ü":
                System.out.println(bigChar + " SesLi Harftir.");
                break;
            default:
                System.out.println("Lütfen istenilen değeri giriniz.");
        }

        scan.close();
    }
}
