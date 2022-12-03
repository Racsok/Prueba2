package CuadroMagico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cuadroMagico {
	public static void main(String[] args) throws IOException{
		// VARIABLES E INSTANCIA
		int opcion = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//inicio de programa
		System.out.println("\n\t\tBienvenidos al programa CUADRO MAGICO");
		do
		{
			cuadroM cuadro = new cuadroM();
			int cuadroM[][];
			//PEDIR TAMAÑO
			System.out.print("\nIngresa el tamaño de la cuadrado magico:"
					+ "3x3[3] o 4x4[4]: ");
			cuadro.size = Integer.parseInt(in.readLine());
			while(cuadro.size != 3 & cuadro.size != 4) {
				System.out.print("Error de tamaño ingrese nuevamente: ");
				cuadro.size = Integer.parseInt(in.readLine());
			}
			System.out.print("\nIngresa el numero incial del rango de los numeros: ");
			cuadro.setNumIni(Integer.parseInt(in.readLine()));
			while(cuadro.getNumIni() <= 0) {
				System.out.print("Error de nuero ingrese nuevamente: ");
				cuadro.setNumIni(Integer.parseInt(in.readLine()));;
			}
			
			//par impar			
			//MOSTRAR
			cuadroM = cuadro.cuadroMagic();
			for(int i=0; i<cuadroM.length; i++) {
				for(int j=0; j<cuadroM.length; j++) {
					System.out.print("| "+cuadroM[i][j]+" |");
				}
				System.out.print("\n");
			}
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
