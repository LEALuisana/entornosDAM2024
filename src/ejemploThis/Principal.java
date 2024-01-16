package ejemploThis;

public class Principal {

	public static void main(String[] args) {
		Rectangulo rect1 = new Rectangulo (5,7);
		rect1.imprimirInfo();
		
		Rectangulo rect2 = rect1.incrementarAncho();
		rect1.imprimirInfo();
		rect2.imprimirInfo();
		
		rect1.incrementarAncho();
		rect1.imprimirInfo();
		rect2.imprimirInfo();
		
		System.out.println(rect1.hashCode());
		System.out.println(rect1.toString());
		
		System.out.println(rect2.hashCode());
		System.out.println(rect2.toString());

	}

}
