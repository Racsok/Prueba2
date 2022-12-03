package Palindormo;

public class valPalindromo {

	private String palabra = "";
	private char letras[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	//METODOS
	boolean palindromo() {
		this.palabra = palabra.replace('á', 'a');
		this.palabra = palabra.replace('é', 'e');
		this.palabra = palabra.replace('í', 'i');
		this.palabra = palabra.replace('ó', 'o');
		this.palabra = palabra.replace('ú', 'u');
		String palabraSin = "";
		String invertida = "";
		for(char letra : this.palabra.toLowerCase().toCharArray()) {
			for(int n=0; n<letras.length; n++) {
				if (letra == letras[n])
					palabraSin +=  Character.toString(letras[n]);
			}
		}
		for (int i = palabraSin.length()-1; i>= 0; i--) {
			invertida += Character.toString(palabraSin.charAt(i));
		}
		if(invertida.contentEquals(palabraSin))
			return true;
		return false;
	}

	
	//GETTERS AND SETTERS
	public String getPalabra() {
		return palabra;
	}
	
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
}
