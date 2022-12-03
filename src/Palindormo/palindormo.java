/* PROYECTO: Pedir notas a estudiantes
 * NOMBRE: Oscar Manuel Contreras Gacha
 * FECHA: 7 oct 2022
 */
package Palindormo;
import java.io.*;

public class palindormo {
	public static void main(String[] args) throws IOException{
		// VARIABLES E INSTANCIA
		int opcion = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\t\tBienvenidos al programa PEDIR NOTAS A ESTUDIANTES");
		do
		{
			valPalindromo pal = new valPalindromo();
			//PREGUNTAR PALABRA
			System.out.print("\nIngrese la frase: ");
			pal.setPalabra(in.readLine());
			
			//MOSTRAR RESPUESTA
			if(pal.palindromo())
				System.out.print("\nLa palabra es palindroma");
			else
				System.out.print("\nLa palabra no es palindroma");
			//REPETIR
			System.out.print("\nDesas hacer otra operacion [si(1) / no(0)]"
				+ "\nEleeci�n: ");
			opcion = Integer.parseInt(in.readLine());
			while(opcion != 1 & opcion != 0) {
				System.out.print("Error intente nuevamente: ");
				opcion = Integer.parseInt(in.readLine());
			}
		}while(opcion != 0);
		//FIN PROGRAMA
		System.out.println("\n\nGracias por usar nuestro programa ¡tenga buen dia!");
	}

}

