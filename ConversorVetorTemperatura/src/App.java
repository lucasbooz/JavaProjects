import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option;
        float celsius, fahrenheit;
        char proc;

        System.out.println("Deseja executar o conversor?[s/n]");
        proc = sc.next().charAt(0);
        while ((proc == 'S') || (proc == 's')) {
            do {
                System.out.println("1 - Celsius -> Fahrenheit");
                System.out.println("2 - Fahrenheit -> Celsius");
                System.out.println("3 - Sair");
                option = sc.nextInt();

                switch (option) {
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

                }
            } while (option != 3);
            System.out.println("Deseja executar novamente?[s/n]");
            proc = sc.next().charAt(0);
        }
        System.out.println("Obrigado por usar o conversor!");
    }
}