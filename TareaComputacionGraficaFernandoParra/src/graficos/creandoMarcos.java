//Fernando Parra Ci:29.646.700
package graficos;
import javax.swing.*;

public class creandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class miMarco extends JFrame{
	public miMarco(){
		//setSize(500,300);
		
		//setLocation(500, 300);
	
		setBounds(500, 300, 250, 250);
		
		//setResizable(false);
		
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setTitle("Titulo De Ventana");
	}
}