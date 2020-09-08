import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if ((a < b && b < c ) || (c < b && b < a)){
            return b;
        }
        else if ((b < a  && a < c) || (c < a && a < b)) {
            return a;
        }
        else {
            return c;
        
        }
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            return a;
        }
        else {
            return b;
        }
    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c = (a*a + b*b);
        return Math.sqrt(c);
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(mone, mtwo, mthree)); // should be 2
        System.out.println(magnitude(maone, mtwo)); // should be -7
        System.out.println(pythagoras(pone, ptwo)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.print("Int: ");
        String medianone = scan.next();
        int mone = Integer.parseInt(medianone);
        System.out.print("Int: ");
        String mediantwo = scan.next();
        int mtwo = Integer.parseInt(mediantwo);
        System.out.print("Int: ");
        String medianthree = scan.next();
        int three = Integer.parseInt(medianthree);
        System.out.print("Int: ");
        String magnitudeone = scan.next();
        int maone = Integer.parseInt(magnitudeone);
        System.out.print("Int: ");
        String magnitudetwo = scan.next();
        int matwo = Integer.parseInt(magnitudetwo);
        System.out.print("Int: ");
        String pythagorasone = scan.next();
        int pone = Integer.parseInt(pythagorasone);
        System.out.print("Int: ");
        String pythagorastwo = scan.next();
        int ptwo = Integer.parseInt(pythagorastwo);


    }
}
