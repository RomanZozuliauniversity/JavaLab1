import java.util.Scanner;
/**
 * Fibonacci - class for actions contains data on the number and value of Luke's number, methods of data access
 * Fibonacci's numbers (0, 1, 1, 2, 3, 5, 8 ...).
 * These numbers it's just another type of sequence like Luke numbers
 */
public class Fibonacci {
    Scanner n = new Scanner(System.in);
    /**
     * getNum() - function that return a length of Fibonacci's numbers
     * * @return num
     */
    public int valueNum() {
        System.out.println("Enter number :");
            return n.nextInt();
    }
    /**
     * outNum() - function that displays the value
     *  number -  the number to display
     */
    public void outNum(int number) {
        System.out.println(number);
    }
    /**
     *  * Num() - function that check whether the Fibonacci numbers are simple
     *  * number -  the number
    */
    public void num(int num) {
        int z;
        int x=1;
        int y=1;
        for(int i=0;i<num - 2;i++) {
            z = x + y;
            int f=2;
            for(;f<z;f++) {
                if (z % f == 0) {
                    break;
                }
            }
            if (f==z) {
                outNum(z);
            }
            x=y;
            y=z;

        }
    }
}