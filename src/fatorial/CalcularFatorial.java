package fatorial;
import java.util.Scanner;
public class CalcularFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Para Calcular o fatorial, digite o número desejado: ");
        int numero = scan.nextInt();
        long fatorial = 1;
        for (int i = 1; i <=numero; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);



    }
}
