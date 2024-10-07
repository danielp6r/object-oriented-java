package l1e04;

import java.util.Scanner;

/**
 *
 * @author danielp6r
 */
public class L1E04 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite a largura do terreno em metros ");
    float lar = input.nextFloat();
    System.out.println("Digite a profundidade do terreno em metros ");
    float prof = input.nextFloat();
    float hec = lar * prof / 10000;
    System.out.println("A área total do terreno é de " + hec + " hectares.");
    }

}
