import java.util.Scanner;

public class MontaMenu {
    Scanner sc = new Scanner(System.in);
    int option;

    public void montaMenu() {
        System.out.println("1 - Celsius -> Fahrenheit");
        System.out.println("2 - Fahrenheit -> Celsius");
        System.out.println("3 - Ajuda");
        System.out.println("4 - Sair");
        System.out.println("Escolha uma opção: ");
        option = sc.nextInt();

    }
}