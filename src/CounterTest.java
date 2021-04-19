import java.util.Scanner;;
public class CounterTest {
    public static void main(String[] args){
        Counter mycounter = new Counter();
        Scanner input = new Scanner(System.in);
        Boolean change = true;
        while(change){
            System.out.print("enter (+) to increase, or (-) to decrease, or (0) to set to 0");
            char a = input.next().charAt(0);
            if(a=='+')
                mycounter.incCounter();
            else if(a=='-')
                mycounter.decCounter();
            else if(a=='0')
                mycounter.toZero();
            mycounter.dispCounter();
            System.out.print("\nDo you want to continue yes (y) or no (n)?");
            a = input.next().charAt(0);
            if(a=='y')
                change = true;
            else
                change = false;
            }
        }

    }
