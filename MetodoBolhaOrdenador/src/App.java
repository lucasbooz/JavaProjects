import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int[] n = new int[11];
            int temp;
            char proc;

            System.out.println("Deseja executar o programa[s/n]");
            proc = sc.next().charAt(0);

            while ((proc == 'S') || (proc == 's')) {

                for (int i = 1; i <= 10; i++) {
                    System.out.print("Digite o " + i + "número: ");
                    n[i] = sc.nextInt();
                }
                for (int i = 1; i <= 10; i++) {
                    System.out.print(n[i]);
                    System.out.print(" ");
                }
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= 10; j++) {
                        if (n[j] > n[i]) {
                            temp = n[i];
                            n[i] = n[j];
                            n[j] = temp;
                        }
                    }
                }
                System.out.print("-> ");
                for (int i = 1; i <= 10; i++) {
                    System.out.print(n[i]);
                    System.out.print(" ");
                }
                System.out.println();
                System.out.println("Deseja executar novamente?[s/n]");
                proc = sc.next().charAt(0);
            }
        }
        System.out.println("Obrigado por utilizar o meu sistema!");
    }
}