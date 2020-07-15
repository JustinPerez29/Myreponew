package mundo;

import javax.swing.JOptionPane;


public class APP {

	public static void main(String[] args) {
		
		Proyecto p = new Proyecto();
		
		String cadena = JOptionPane.showInputDialog("Digite los caracteres seguidos de una ' ' ejemplo: '1 2 3'");
		
		p.formato(cadena);
		
	}

}
