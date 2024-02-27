import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double pi = Math.PI;
        System.out.print("Digite o raio: ");
        float r = s.nextFloat();
        double area = pi*(r*r);
        System.out.println("a area do circulo é: "+area);
    }
}
