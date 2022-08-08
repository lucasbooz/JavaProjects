import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            float salarioAtual, aumento, reajuste;
            char proc;

            System.out.println("Deseja executar o programa?[s/n]");
            proc = sc.next().charAt(0);

            while ((proc == 'S') || (proc == 's')) {

                System.out.print("Informe o salário: ");
                salarioAtual = sc.nextFloat();

                System.out.print("Informe o aumento(%): ");
                aumento = sc.nextInt();

                reajuste = ((aumento / 100)) + 1;

                System.out.println(salarioAtual + "+" + aumento + "%=" + reajuste * salarioAtual);
                System.out.println("Deseja executar novamente?[s/n]");
                proc = sc.next().charAt(0);
            }
        }
    }
}