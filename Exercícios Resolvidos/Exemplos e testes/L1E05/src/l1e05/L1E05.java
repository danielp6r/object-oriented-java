package l1e05;

import java.util.Scanner;

/**
 *
 * @author danielp6r
 */
public class L1E05 {

    public static void main(String[] args) {
    float vasP = 0.10f;
    float vasG = 0.25f;
    Scanner input = new Scanner(System.in);
    System.out.println("Digite a quantidade de vasilhames com 1l ou menos. ");
    int qtdP = input.nextInt();
    System.out.println("Digite a quantidade de vasilhames com mais de 1l. ");
    int qtdG = input.nextInt();
    float total = ((qtdP * vasP) + (qtdG * vasG));
    System.out.printf("O valor do retorno é de R$: " + total + ".\n");
    }

}
