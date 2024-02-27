import java.util.Scanner;

public class mediaP {
    public static void main (String[] arg){
        Scanner s = new Scanner(System.in);

        System.out.print("Escreva o primeiro numero: ");
        Float num1 = s.nextFloat()*3;

        System.out.print("Escreva o sugundo numero: ");
        float num2 = s.nextFloat()*5;

        System.out.print("Escreva o terceiro numero: ");
        float num3 = s.nextFloat()*8;

        float ponderada = (num1+num2+num3)/3;

        System.out.println(ponderada);

    }
}
