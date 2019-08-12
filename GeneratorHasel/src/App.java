import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String str = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm!@#$%^&*()";

        System.out.print("Podaj długość hasła z przedziału 1-127: ");
        String x = scanner.nextLine();

        int dlugoscHasla = 0;

        try{

            dlugoscHasla = Byte.parseByte(x);
            if(dlugoscHasla<1){
                System.out.println("Podana liczba jest za mała!");
            }
        }
        catch (NumberFormatException ex){
            System.out.println("Podana wartość nie jest liczbą albo jest za duża!");

        }

        String haslo = "";

        for(int i=0;i<dlugoscHasla;i++){
            int pos = random.nextInt(72);
            haslo = haslo + str.charAt(pos);

        }
        System.out.println("Hasło: "+haslo);





    }

}
