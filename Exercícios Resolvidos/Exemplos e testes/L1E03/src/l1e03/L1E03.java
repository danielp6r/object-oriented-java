package l1e03;

import java.util.Scanner;

/**
 *
 * @author danielp6r
 */
public class L1E03 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite a largura da sala em metros.");
    float largura = input.nextFloat();
    System.out.println("Digite a profundidade da sala em metros.");
    float profundidade = input.nextFloat();
    float area = largura * profundidade;
    System.out.println("A área total da sala é de: " + area + " metros quadrados.");
    }

}
