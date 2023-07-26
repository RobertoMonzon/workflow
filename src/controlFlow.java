import java.util.Scanner;

public class controlFlow {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Escribe tu rango de ventas: ");
	Float rango= in.nextFloat();
	char comision;
	if  (rango => 10000) {
		System.out.println("comision= " + (rango*0.3));
	}else if (rango => 5000 && rango < 9999) {
		System.out.println("comision= " + (rango*0.2));
	}else if(rango => 1000 && rango < 4999) {
		System.out.println("comision= " + (rango*0.1));
	}else if(rango <1000){
		System.out.println("Comision= 0");
	}else {
		System.out.println("Entrada incorrecta");
	}

	in.close();
	
}
}
