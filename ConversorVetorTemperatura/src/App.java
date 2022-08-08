import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MontaMenu montaMenu = new MontaMenu();
        float[] temperatura = new float[4];
        int[] hora = new int[4];
        int n;
        float celsius, fahrenheit;
        char proc;

        do {
            montaMenu.montaMenu();

            switch (montaMenu.option) {
                case 1:

                    System.out.println("Informe a temperatura em Celsius(ºC): ");
                    celsius = sc.nextFloat();
                    System.out.println("Temperatura em Fahrenheit(ºF): " + ((celsius * 1.8f) + 32) + "ºF.");
                    break;
                case 2:
                    System.out.println("Informe a temperatura em Fahrenheit(ºF): ");
                    fahrenheit = sc.nextFloat();
                    System.out.println("Temperatura em Celsius(ºC): " + ((fahrenheit - 32) / 1.8) + "ºC.");
                    break;
                case 3:
                    System.out.println("Fórmula ºC -> ºF: F = (C * 1.8) + 32");
                    System.out.println("Fórmula ºF -> ºC: C = (F - 32) / 1.8");
                    break;
            }
        } while (montaMenu.option != 4);
        System.out.println("Deseja executar novamente?[s/n]");
        proc = sc.next().charAt(0);

        System.out.println("Obrigado por usar o conversor!");
    }
}
