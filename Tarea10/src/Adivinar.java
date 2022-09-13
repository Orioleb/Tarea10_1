import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Adivinar {
	static Scanner teclat= new Scanner(System.in);
	public static void main(String[] args) {
		//rango
		int minval=1;
		int maxval=500;
		//generamos entero aleatoriamente
		int numero=ThreadLocalRandom.current().nextInt(minval, maxval + 1);
		boolean trobat=false;
		int cont=1;
		int usuari=0;
		while(trobat==false){
			boolean repetir;
			//hasta que no tengamos un entero saltara la excepcion
			do{
				repetir=false;
				try {
					
					System.out.println("Introduzca un valor del 1 al 500(entero)");
					usuari=teclat.nextInt();
					
				}catch(InputMismatchException e) {
					System.out.println("Tiene que ser un entero");
					teclat.nextLine();
					repetir=true;
				}
			}while(repetir);
			//condiciones de juego
			if(numero==usuari) {
				trobat=true;
				cont++;
				System.out.println("Has ganado, al intento numero "+cont);
			}
			else {
				if(usuari>numero) {
					System.out.println("El numero es mas pequeño");
				}
				else {
					System.out.println("El numero es mas grande");
				}
			}
			cont++;
	}
		
		
	}

}
