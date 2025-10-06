import java.math.BigDecimal;
import java.util.Scanner;

public class PromocaoRelampago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;

        if (valor.compareTo(new BigDecimal("50.00")) < 0) {
            return "Desconto de 0%";
        } else if (valor.compareTo(new BigDecimal("100.00")) <= 0) {
            return "Desconto de 10%";
        } else {
            return "Desconto de 20%";
        }
    }
}