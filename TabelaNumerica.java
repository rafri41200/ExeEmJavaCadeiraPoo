
public class TabelaNumerica {
	public static void main (String[] args) {
		int tam=10;
		int valor;
		
		for(int i = 1 ; i <= tam ; i++) {
			for(int n=1; n <= i ; n++) {
				valor=i*n;
				System.out.print(valor +" ");		
				
			}
			System.out.println(); 
		}
	}

}
