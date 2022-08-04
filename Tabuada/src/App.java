import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            char proc;
            int n = 0;
            System.out.println("Deseja executar o algorítmo?[s/n]");
            proc = sc.next().charAt(0);
            while ((proc == 'S') || (proc == 's')) {
                System.out.println("Informe uma tabuada: ");
                n = sc.nextInt();
                for (int i = 0; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + i * n);
                }
                System.out.println("Deseja executar novamente?[s/n]");
                proc = sc.next().charAt(0);
            }
        }
        System.out.println("Obrigado por usar o sistema!");
    }
}
