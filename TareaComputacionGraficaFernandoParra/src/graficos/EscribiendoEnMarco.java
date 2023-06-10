package graficos;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;;

public class EscribiendoEnMarco {
    
    public static void main(String[] args) {
        marcoConTexto mimarco = new marcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/**
 * MarcoConTexto*/
class marcoConTexto extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public marcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer Texto");
		
		lamina miLamina = new lamina();
		add(miLamina);
	}
}

class lamina extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics graphic) {
		
		super.paintComponent(graphic);
		graphic.drawString("Hola Mundo", 100, 100);
		
	}
}