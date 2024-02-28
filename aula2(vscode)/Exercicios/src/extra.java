import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira quantos salarios minimos fulaninho ganha: ");
        double quantidade = s.nextDouble();

        double sm = 1412.00;
        double salario = quantidade*sm;

        System.out.format("O salario de fulaninho é igual a "+salario);

        double acrecimo = (salario*0.1)+salario;
        System.out.println(" e com o acrecimo de 10% ficaria no total de "+acrecimo);


        // inverasao
        System.out.print("Insira o valor de a: ");
        float a = s.nextFloat();

        System.out.print("Insira o valor de b: ");
        float b = s.nextFloat();

        System.out.printf("o valor de a é %.1f %.1f", b, a);

    }
}
