import java.io.IOException;
import java.util.Scanner;
public class FlightTest {
   public static void main(String[] args)throws IOException{
    Scanner input = new Scanner(System.in);
    System.out.println("How many flights would you like to update?");
    int numflight = input.nextInt();
    Flight flight[] = new Flight[numflight];


    for(int i = 0; i<numflight; i++){
        System.out.print("Enter an airline name...");
        String a = input.next();
        System.out.print("Enter a flight number...");
        int b = input.nextInt();
        System.out.print("Enter an origin...");
        String c = input.next();
        System.out.print("Enter a destination...");
        String d = input.next();
        flight[i] = new Flight(a, b, c, d);
        System.out.println(flight[i].toString());
    }
    input.close();
   } 
}
