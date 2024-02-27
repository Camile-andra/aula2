import java.util.Scanner;

public class media {
    public static void main (String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Escreva o primeiro numero: ");
        Float num1 = s.nextFloat();

        System.out.print("Escreva o sugundo numero: ");
        float num2 = s.nextFloat();

        System.out.print("Escreva o terceiro numero: ");
        float num3 = s.nextFloat();

        Float media = (num1*num2*num3)/3;

        System.out.format("A media de %.0f e %.0f e %.0f é %.0f", num1, num2, num3, media);

    }
}
