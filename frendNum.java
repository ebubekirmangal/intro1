import java.util.Scanner;

public class frendNum {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Arkadaş Sayılar mı?");
    System.out.println("-------------------");


    System.out.print("Lütfen ilk sayıyı giriniz: ");
    int firstN = scan.nextInt();
    System.out.println("");
    System.out.print("Lütfen ikinci sayı giriniz: ");
    int secondN = scan.nextInt();

    int check =0;
    int check2 =0;

    for(int i =1;i <firstN;i++){
        if(firstN%i == 0){
            check +=i;
        }else{

        }
    }
    for(int j =1; j<secondN;j++){
        if(secondN%j == 0){
            check2 +=j;
        }else{

        }
    }

    if(check == secondN & check2 == firstN){
        System.out.println(firstN +" ve "+ secondN +" Arkadaş sayılardır.");
    }else{
        System.out.println(firstN +" ve "+ secondN +" Arkadaş sayı değillerdir.");
    }

    System.out.println(check);
   

    scan.close();
    }
}
