package mundo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Proyecto {
	
	String NOACEPTADOS = "";
	
	
	
	public ArrayList<Integer> formato(String cadena) {
		String cad = cadena.trim();
		cad = cad.toLowerCase();
		String[] cade = cad.split(" ");
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		
		for (int i = 0; i < cade.length; i++) {
			
			if (isNumeric(cade[i]) ) {
				numeros.add(Integer.parseInt(cade[i]));
			}
			else {
				NOACEPTADOS += cade[i] + " - ";
			}
		}
		mostarNumeros(numeros);
		return numeros;
	}
	
	public void mostarNumeros(ArrayList<Integer> contenedora)
	{
		int suma = 0;
		for (int i = 0; i < contenedora.size(); i++) {
			suma += contenedora.get(i);
		}
		JOptionPane.showMessageDialog(null, "La suma de sus numeron es : " + suma);
		JOptionPane.showMessageDialog(null, "Caracteres que no son Numericos : " + NOACEPTADOS);
		
	}
	
	
	public int sumar(int x, int y) {
		
		return x + y;
	}

	private boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
