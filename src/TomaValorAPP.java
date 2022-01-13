
public class TomaValorAPP {

	public static void main(String[] args) {
		
		int A = 2, B = 4, C = 6, D = 8, Auxiliar;
		System.out.println("Valores iniciales:");
		System.out.println("La variable A es = " + A);
		System.out.println("La variable B es = " + B);
		System.out.println("La variable C es = " + C);
		System.out.println("La variable D es = " + D);
		System.out.println();
		
		Auxiliar = B;		
		B = C;
		C = A;
		A = D;
		D = B;		
		D = Auxiliar;
		
		System.out.println("Valores modificados:");
		System.out.println("La variable B ahora es C = " + B);
		System.out.println("La variable C ahora es A = " + C);
		System.out.println("La variable A ahora es D = " + A);
		System.out.println("La variable D es ahora B = " + D);
		
	}
}
