import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		int n;
		int f = 1;
		
		System.out.println("Insira um numero para calcular o fatorial: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
		f = f * i;
		}
		System.out.println("O fatorial de "+ n +" é igual a: "+ f);
	}

}
