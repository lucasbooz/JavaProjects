import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[][] cinema = new String[10][10];
        int i, j, fila, poltrona;
        String op;
        char proc;

        System.out.println("Deseja executar o CineFlix?[s/n]");
        proc = sc.next().charAt(0);

        while ((proc == 'S') || (proc == 's')) {
            // codigo vai aqui
        }
        System.out.println("Deseja executar novamente o CineFlix[s/n]");
        proc = sc.next().charAt(0);

    }
}
