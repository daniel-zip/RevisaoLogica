package operadores;

public class Aritmetico {

	public static void main(String[] args) {
		double x, y, z, w, r;
		
		x = 5;
		y = 2;
		z = 10;
		w = 4;
		
		r = (x + z) / y - w;
		System.out.println("R: " + r);
		
		System.out.println("Z: " + z);
		z = z + w;
		System.out.println("Z: " + (x + z));
		
		System.out.println("Comparadores");
		System.out.println(!(x <= y));
		
		System.out.println("X: " + x--);
		System.out.println("X: " + x);
		
		// se x é par E é maior que 10:
		System.out.println(x%2 == 0 && x > 10);
		
		// se x é par OU é maior que 10:
		System.out.println(x%2 == 0 || x > 10);
		
	}


}
