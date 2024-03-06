import java.util.Scanner;

public class WBig{
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);

   System.out.print("1.sayıyı giriniz: ");
   double birinci = scan.nextDouble();

   System.out.print("2.sayıyı giriniz: ");
   double ikinci = scan.nextDouble();

   System.out.println("");
   
   if(birinci == ikinci){
System.out.println(birinci + "  eşittir " + ikinci);
   }
   else if(birinci < ikinci){
    System.out.println(birinci +" küçüktür "+ikinci);
   } else{
    System.out.println(birinci +" büyüktür "+ikinci);
   };

   scan.close();
    }
}
