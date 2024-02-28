import java.util.Scanner;

public class inversao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("valor de a: ");
        float aP =  s.nextFloat();

        System.out.println("valor de b: ");
        float bF = s.nextFloat();

        float a = bF;
        float b = aP;

        System.out.printf("%.0f %.0f ", a, b);
    }
}
