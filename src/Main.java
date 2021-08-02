import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double n1, n2 , m ;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um numero: ");
		n1 = teclado.nextDouble();
		System.out.println("digite o 2 numero:");
		n2 = teclado.nextDouble();
		m = (n1 + n2) / 2;
		System.out.println("a media entre os doois numeros é " + m);
	}

}
