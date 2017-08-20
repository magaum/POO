package poo;

public class OperadoresLogicos {

	public void and (boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
		for (int i = 0; i < 4; i++) {
				resultado[i] = coluna1[i] && coluna2[i];
				System.out.printf("%s and %s = %s\n",coluna1[i],coluna2[i],resultado[i]);
			}
		}
	
	public void or (boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
		for (int i = 0; i < 4; i++) {
				resultado[i] = coluna1[i] || coluna2[i];
				System.out.printf("%s and %s = %s\n",coluna1[i],coluna2[i],resultado[i]);
			}
		}

	public void not (boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
		for (int i = 0; i < 4; i++) {
				resultado[i] = !coluna1[i] && !coluna2[i];
				System.out.printf("%s and %s = %s\n",coluna1[i],coluna2[i],resultado[i]);
			}
		}

	
	public static void main(String[] args) {
		boolean[] coluna1 = {true,true,false,false};
		boolean[] coluna2 = {true,false,true,false};
		boolean[] resultado = new boolean[4];
		OperadoresLogicos opLogicos = new OperadoresLogicos();
		
		/*opLogicos.and(coluna1, coluna2, resultado);
		opLogicos.or(coluna1, coluna2, resultado);*/
		opLogicos.not(coluna1, coluna2, resultado);
	}
}