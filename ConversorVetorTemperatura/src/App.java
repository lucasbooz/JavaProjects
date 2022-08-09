import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MontaMenu montaMenu = new MontaMenu();
        TelaAjuda telaAjuda = new TelaAjuda();
        ArmazenaVetor armazenaVetor = new ArmazenaVetor();
        char proc;

        System.out.println("Deseja executar o sistema?[s/n]");
        proc = sc.next().charAt(0);
        while ((proc == 'S') || (proc == 's')) {
            do {
                montaMenu.montaMenu();

                switch (montaMenu.option) {
                    case 1:
                        armazenaVetor.armazenaVetor();
                        break;
                    case 2:
                        armazenaVetor.armazenaVetor();
                        break;
                    case 3:
                        telaAjuda.telaAjuda();
                        break;
                }
            } while (montaMenu.option != 4);
            System.out.println("Deseja executar novamente?[s/n]");
            proc = sc.next().charAt(0);
        }
        System.out.println("Obrigado por usar o conversor!");
    }
}
