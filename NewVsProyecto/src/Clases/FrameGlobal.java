package Clases;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class FrameGlobal extends JFrame{
	
	private JMenuBar barraMenu;
	private JMenu archivo;
	private JMenuItem empleado;
	private JMenuItem salir;
	private static JDesktopPane escritorio;
	
	
	
	

	public FrameGlobal() {
		
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(1000,700);
         setLocationRelativeTo(null);
		
		 barraMenu = new JMenuBar();
		 setJMenuBar(barraMenu);
		 archivo = new JMenu("Archivo");
		 empleado = new JMenuItem("Empleado");
		 salir = new JMenuItem("Salir");
		 
		 escritorio = new JDesktopPane();
		 setContentPane(escritorio);
		 
		 
		 barraMenu.add(archivo);
		 archivo.add(empleado);
		 archivo.add(salir);
		
		
		 
		 
		 
		 empleado.addActionListener(new ListenerGlobal(this));
		 salir.addActionListener(new ListenerGlobal(this));
		 
	}





	public JMenuBar getBarraMenu() {
		return barraMenu;
	}


	public void setBarraMenu(JMenuBar barraMenu) {
		this.barraMenu = barraMenu;
	}


	public JMenu getArchivo() {
		return archivo;
	}


	public void setArchivo(JMenu archivo) {
		this.archivo = archivo;
	}


	public JMenuItem getEmpleado() {
		return empleado;
	}





	public void setEmpleado(JMenuItem empleado) {
		this.empleado = empleado;
	}
	
	
	public JMenuItem getSalir() {
		return salir;
	}
	
	public void setSalir(JMenuItem salir) {
		this.salir=salir;
	}





	public static void Funcionalidad() {
		// TODO Auto-generated method stub
		Frame miFrame = new Frame();
		escritorio.add(miFrame);
		miFrame.show();
		
//		
		
		
	}




	

	
	
	
}
