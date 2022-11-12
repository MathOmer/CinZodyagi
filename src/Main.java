import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        yil = input.nextInt();

        if ((yil % 12) == 0){
            System.out.println("Çin Zodyağı burcunuz: Maymun");
        }else if ((yil % 12) == 1){
            System.out.println("Çin Zodyağı burcunuz: Horoz");
        }else if ((yil % 12) == 2){
            System.out.println("Çin Zodyağı burcunuz: Köpek");
        }else if ((yil % 12) == 3){
            System.out.println("Çin Zodyağı burcunuz: Domuz");
        }else if ((yil % 12) == 4){
            System.out.println("Çin Zodyağı burcunuz: Fare");
        }else if ((yil % 12) == 5){
            System.out.println("Çin Zodyağı burcunuz: Öküz");
        }else if ((yil % 12) == 6){
            System.out.println("Çin Zodyağı burcunuz: Kaplan");
        }else if ((yil % 12) == 7){
            System.out.println("Çin Zodyağı burcunuz: Tavşan");
        }else if ((yil % 12) == 8){
            System.out.println("Çin Zodyağı burcunuz: Ejderha");
        }else if ((yil % 12) == 9){
            System.out.println("Çin Zodyağı burcunuz: Yılan");
        }else if ((yil % 12) == 10){
            System.out.println("Çin Zodyağı burcunuz: At");
        }else if ((yil % 12) == 11){
            System.out.println("Çin Zodyağı burcunuz: Koyun");
        }else{
            System.out.println("Hatali giriş yapyınız.");
        }
    }
}