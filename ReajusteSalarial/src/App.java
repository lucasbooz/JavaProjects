import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float salarioAtual, aumento;

        System.out.print("Informe o salário: ");
        salarioAtual = sc.nextFloat();

        aumento = salarioAtual * 1.3f;

        System.out.println(salarioAtual + " +30% = " + aumento);
    }
}
