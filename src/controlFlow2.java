import java.util.Scanner;

public class controlFlow2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Escribe tu edad: ");
	Float edad= in.nextFloat();
	if  (edad > 5 && edad <60) {
		System.out.println("Cuantos boletos: ");
		int cantidad= in.nextInt();
		if (cantidad >=2){
			System.out.println("Tienes un 30% de descuento ");
		}else {
			System.out.println("Pagas tarifa completa ");
		}
		
	}else if (edad < 5) {
		System.out.println("Tienes un descuento del 60%");
	}else if (edad > 60) {
	System.out.println("Tienes un descuento del 55%");
	}else {
		System.out.println("Entrada incorrecta");
	}

	in.close();
	
}
}
