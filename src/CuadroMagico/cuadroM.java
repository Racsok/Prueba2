package CuadroMagico;

public class cuadroM {
	private int matriz[][];
	int size = 0;
	private int numIni;
	
	int[][] cuadroMagic()
	{
		matriz = new int[size][size];
		if ((size+1)%2 == 0) 
		{//matriz impar
			int num = numIni;
			int fila = 0;
			int colum = this.size/2;
			int f,c;
			while(num <= numIni+8) {
				matriz[fila][colum] = num;
				num +=1;
				f = fila; 
				c = colum;
				fila -= 1;
				colum += 1;
				if(fila == -1)
					fila = size-1;
				if(colum == size) 
					colum = 0;
				if(matriz[fila][colum] != 0) {
					fila = f+1;
					colum = c;
				}		
			}
			return matriz;
		}else
		{
			int num = numIni;
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					System.out.println(i+""+j+" : "+num);
					if(i==j || (i==0 & j==3) || (i==1 & j==2) || (i==2 & j==1) || (i==3 & j==0))
						matriz[i][j] = num;
					num++;
				}
			}
			num = numIni;
			for(int i=size-1; i>=0; i--) {
				for(int j=size-1; j>=0; j--) {
					
					if(matriz[i][j] == 0)
						matriz[i][j] = num;
					num++;
				}
			}
			return matriz;	
		}
	}
	//getters and setters
	public int getNumIni() {
		return numIni;
	}

	public void setNumIni(int numIni) {
		this.numIni = numIni;
	}
	
	
}
