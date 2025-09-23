import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       var scanner = new Scanner(System.in);

        System.out.println("Olá, informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %d \n", name, age);



    }
}
