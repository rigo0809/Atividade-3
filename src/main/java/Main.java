import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número: ");

            int numero = sc.nextInt();
    System.out.printf("Numero  = %d", numero);

    if (numero %  2 == 0) {
      System.out.println(" é Par.");
    } else if (numero % 1 == 0) {
      System.out.println(" é Impar.");
    }
            sc.close();



  }
}