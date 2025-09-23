import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        System.out.println("Tabuada do " + num + ":");

        for (int i = 0; i <= 10; i++){
            System.out.println(num + "x" + i + " = " + (num * i));
        }
    }
}