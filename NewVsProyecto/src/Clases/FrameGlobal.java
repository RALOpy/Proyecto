package Clases;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameGlobal extends JFrame {

	private JMenuBar barraMenu;
	private JMenu archivo;
	private JMenuItem empleado;
	private JMenuItem salir;
	private static JDesktopPane escritorio;
	private JDialog dialogoPrincipal;

	private JLabel nombreEmpresa;
	private JPanel pnlDialogoCentral;
	private JPanel pnlDialogoSur;
	private JPanel pnlDialogoLblNombre;
	private JPanel pnlDialogotxtNombre;
	private JPanel pnlDialogoBtnContinuar;
	private JTextField txtNombreEmpresa;
	private JButton btnDialogoContinuar;
	
	private String nomEmpresa;

	@SuppressWarnings("serial")
	public FrameGlobal() {
		//DIALOGO PARA INICIO DE EMPRESA
		dialogoPrincipal    = new JDialog();
		dialogoPrincipal.setTitle("Bienvenido");
		pnlDialogoCentral   = new JPanel();
		pnlDialogoSur       = new JPanel();
		pnlDialogoLblNombre = new JPanel();
		pnlDialogotxtNombre = new JPanel();
		pnlDialogoBtnContinuar = new JPanel();
		nombreEmpresa       = new JLabel("Nombre para empresa");
		txtNombreEmpresa    = new JTextField();

		txtNombreEmpresa.addKeyListener(new KeyAdapter(){ 
			public void keyReleased (KeyEvent e) {
				btnDialogoContinuar.setEnabled(txtNombreEmpresa.getText().length() != 0 );
				
			}
			
//			public void keyPressed(KeyEvent e) {
//				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//					btnDialogoContinuar.setFocusable(true);
//				}
//			}
		});
		txtNombreEmpresa.addKeyListener(new KeyListener(this));
		txtNombreEmpresa.setColumns(10);
		
		
		btnDialogoContinuar = new JButton("CONTINUAR");
		btnDialogoContinuar.setEnabled(false);
		btnDialogoContinuar.addActionListener(new ListenerDialogo(this));
		
		dialogoPrincipal.setVisible(true);
		
		dialogoPrincipal.setLayout(new BorderLayout());
		
		dialogoPrincipal.add(pnlDialogoCentral, BorderLayout.CENTER);
		dialogoPrincipal.add(pnlDialogoSur,BorderLayout.SOUTH);
		
		pnlDialogoCentral.setLayout(new GridLayout(2,0));
		pnlDialogoCentral.add(pnlDialogoLblNombre); 
		pnlDialogoLblNombre.add(nombreEmpresa);
		
		pnlDialogoCentral.add(pnlDialogotxtNombre);
		pnlDialogotxtNombre.add(txtNombreEmpresa);
		
		pnlDialogoSur.add(pnlDialogoBtnContinuar);
		pnlDialogoBtnContinuar.add(btnDialogoContinuar);
		
		
		
		dialogoPrincipal.pack();
		dialogoPrincipal.setLocationRelativeTo(null);
		
		
		
		//INICIO DE FRAME PRINCIPAL
		setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 700);
		setTitle("Mi empresa");
		

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
		
		setLocationRelativeTo(null);
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
		this.salir = salir;
	}
	
	public static JDesktopPane getEscritorio() {
		return escritorio;
	}

	public JDialog getDialogoPrincipal() {
		return dialogoPrincipal;
	}

	public JLabel getNombreEmpresa() {
		return nombreEmpresa;
	}

	public JPanel getPnlDialogoCentral() {
		return pnlDialogoCentral;
	}

	public JPanel getPnlDialogoSur() {
		return pnlDialogoSur;
	}

	public JPanel getPnlDialogoLblNombre() {
		return pnlDialogoLblNombre;
	}

	public JPanel getPnlDialogotxtNombre() {
		return pnlDialogotxtNombre;
	}

	public JPanel getPnlDialogoBtnContinuar() {
		return pnlDialogoBtnContinuar;
	}

	public JTextField getTxtNombreEmpresa() {
		return txtNombreEmpresa;
	}

	public JButton getBtnDialogoContinuar() {
		return btnDialogoContinuar;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}
	
	public void setNomEmpresa(String nom) {
		this.nomEmpresa = nom;
	}

	public static void Funcionalidad() {
		// TODO Auto-generated method stub
		Frame miFrame = new Frame();
		escritorio.add(miFrame);
		miFrame.show();

	}

}
