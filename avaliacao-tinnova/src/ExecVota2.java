/**
 * total de eleitores = 1000 válidos = 800 votos brancos = 150 votos nulos = 50
 * 
 * Faça uma classe com 3 métodos que calculam...
 * 
 * o percentual de votos válidos em relação ao total de eleitores, o percentual
 * de brancos em relação ao total de eleitores, o percentual de nulos em relação
 * ao total de eleitores.
 */

public class ExecVota2 {

	public static void main(String[] args) {

		double totalEleitores = 1000;
		double validos = 800;
		double brancos = 150;
		double nulos = 50;
		double totvalidos;
		double totbrancos;
		double totnulos;

		System.out.println("Total de eleitores: " + totalEleitores);
		totvalidos = (validos / totalEleitores) * 100;
		System.out.println("Total de votos válidos: " + totvalidos + "%");
		totbrancos = (brancos / totalEleitores) * 100;
		System.out.println("Total de votos brancos: " + totbrancos + "%");
		totnulos = (nulos / totalEleitores) * 100;
		System.out.println("Total de votos nulos: " + totnulos + "%");
	}

}
