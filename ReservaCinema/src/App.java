import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String[][] cinema = new String[10][10];
            int fila, poltrona, op;
            char proc;

            System.out.println("Deseja executar o CineFlix?[s/n]");
            proc = sc.next().charAt(0);

            while ((proc == 'S') || (proc == 's')) {

                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= 9; j++) {
                        cinema[i][j] = "o";
                    }
                }
                do {
                    System.out.println();
                    System.out.println("-Ingressos CineFlix-");
                    System.out.println("------------------");
                    System.out.println("1 - Reservar");
                    System.out.println("2 - Layout do cinema");
                    System.out.println("3 - Sair");
                    System.out.println();
                    System.out.print("Por favor selecione uma opção: ");
                    op = sc.nextInt();

                    if ((op < 1) || (op > 3)) {
                        System.out.println("Opção Inválida!");
                    }

                    switch (op) {
                        case 1:
                            System.out.println("Reservar");
                            System.out.println("Informe a fila[1-10]");
                            fila = sc.nextInt();
                            System.out.println("Informe a poltrona[1-10]");
                            poltrona = sc.nextInt();

                            if (cinema[fila][poltrona] == "o") {
                                cinema[fila][poltrona] = "X";
                            } else {
                                System.out.println();
                                System.err.println("Poltrona já ocupada!");
                            }
                            break;

                        case 2:
                            System.out.println("Layout");
                            for (int i = 1; i <= 9; i++) {
                                System.out.println();
                                for (int j = 1; j <= 9; j++) {
                                    System.out.print("" + cinema[i][j] + "");
                                }
                            }
                            break;
                    }

                } while (op != 3);

                System.out.println("Deseja executar novamente o CineFlix[s/n]");
                proc = sc.next().charAt(0);
            }
        }
        System.out.print("Obrigado por usar CineFlix!");
    }
}