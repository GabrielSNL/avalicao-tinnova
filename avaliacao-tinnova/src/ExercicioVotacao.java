import java.util.Scanner;

/**
 * total de eleitores = 1000 válidos = 800 votos brancos = 150 votos nulos = 50
 * 
 * Faça uma classe com 3 métodos que calculam...
 * 
 * o percentual de votos válidos em relação ao total de eleitores, o percentual
 * de brancos em relação ao total de eleitores, o percentual de nulos em relação
 * ao total de eleitores.
 */

public class ExercicioVotacao {

	public static void main(String[] args) {

		double a, b, c;
//		System.out.println("Escolha um tipo de voto: ");
//		Scanner f = new Scanner(System.in);
		
		System.out.println("Insira o valor de eleitores que vc deseja saber: ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		Scanner d = new Scanner(System.in);
		System.out.println("Insira o Total de Eleitores: ");
		b = d.nextInt();
		c = (a / b)*100;
		System.out.println("Porcentagem total de votos é: "+c+"%");
				
	}

}
