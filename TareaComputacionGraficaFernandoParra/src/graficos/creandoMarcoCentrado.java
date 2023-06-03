//Fernando Parra Ci:29.646.700
package graficos;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class creandoMarcoCentrado {

	public static void main(String[] args) {
		MarcoCentrado mimarco = new MarcoCentrado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame {
	public MarcoCentrado (){
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension screensize = miPantalla.getScreenSize();
		int screenheight = (int) screensize.getHeight();
		int screenwidth = (int) screensize.getWidth();

		setSize(screenwidth/2, screenheight/2);
		setLocation(screenheight/4, screenwidth/4);


	}
}