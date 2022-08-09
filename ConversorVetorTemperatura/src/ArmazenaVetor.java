import java.util.Scanner;

public class ArmazenaVetor {
    Scanner sc = new Scanner(System.in);
    float[] temperatura = new float[5];
    int[] hora = new int[5];

    public void armazenaVetor() {
        for (int i = 0; i <= 4; i++) {
            System.out.print("Informe a temperatura " + i + ": ");
            temperatura[i] = sc.nextFloat();
            System.out.print("Informe a hora " + i + ": ");
            hora[i] = sc.nextInt();
        }
    }
}
