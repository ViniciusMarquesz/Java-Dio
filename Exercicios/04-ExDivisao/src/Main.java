import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        float valorSalario = scanner.nextFloat();
        float valorBeneficio = scanner.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100 ) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else if (valorSalario > 2500) {
            valorImposto = 0.15F * valorSalario;
        } else {
            System.out.println("Salário incorreto");
            return;
        }


        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f", saida));


        scanner.close();
    }
}