import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("digite o lado: ");
        float lado = s.nextFloat();

        float area = lado*lado;

        System.out.format("A area do quadrado de lado %.0f é %.0f", lado, area);
    }
}
