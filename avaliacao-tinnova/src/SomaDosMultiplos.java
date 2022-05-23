import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 
 * @author Gabriel
 *
 *Soma dos multiplos de 3 ou 5
 */

public class SomaDosMultiplos {

	public static void main(String[] args) {

		int x;
		System.out.println("Insira um valor: ");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		int y = IntStream.range(1, x).filter(n -> (n % 3 ==0) || (n % 5 == 0)).sum();
		System.out.println("A soma dos números múltiplos de 3 ou 5 até esse valor é de: "+y);
		
	}

}
