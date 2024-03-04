import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {

		int x;
		int y=0;
		Scanner Teclado = new Scanner(System.in);	

		// input
		System.out.println(" Digite um valor inteiro para x: ");

		x = Teclado.nextInt();

		do {

			if(x%2 == 0) {
				y = x / 2;

			} else if(x%2 != 0) {
				y = 3 * x + 1;
			}
			System.out.println(" o valor de y: " +y);
			x = y;


		} while( y != 1);

	}
}
