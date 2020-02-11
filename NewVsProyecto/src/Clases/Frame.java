package Clases;

import Clases.MyListener;
import Clases.Persona;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Frame extends JInternalFrame {

	private JPanel panelPrincipal;

	private List<Persona> lstPersona;

	private JPanel panelPrincipal1;
	private JTable table;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCerrar;
	private JPanel panelNorte;
	private JPanel panelSur;
	private JPanel panelSur1;
	private JPanel panelSur2;
	private JLabel lbtext1;
	private JLabel lbtext2;
	private JPanel panelAux;
	private String cabecera[];

	public Frame() {
		super("Lista de empleados");
		lstPersona = new ArrayList<Persona>();

		setSize(600, 600);
		setLocation(200, 10);
		setResizable(true);
		setClosable(true);
		setIconifiable(true);
		//setClosable(true);
		

		panelPrincipal1 = new JPanel();
		panelPrincipal1.setLayout(new BorderLayout());
		setContentPane(panelPrincipal1);

		
		panelNorte = new JPanel();
		panelPrincipal1.add(panelNorte, BorderLayout.NORTH);

		lbtext2 = new JLabel("Futuro buscador");
		panelNorte.add(lbtext2);
		
	    panelAux = new JPanel();

		String[] cabecera = {};
		String[][] datos = {};

		JScrollPane scrollPane = new JScrollPane();
		table = new JTable(datos, cabecera);
		scrollPane.setViewportView(table);
		
		
		
		
		
	    panelAux.add(scrollPane);	
		panelPrincipal1.add(panelAux, BorderLayout.CENTER);

		

		panelSur = new JPanel();
		panelSur.setLayout(new GridLayout(2, 1));
		panelPrincipal1.add(panelSur, BorderLayout.SOUTH);

		panelSur1 = new JPanel();
		panelSur.add(panelSur1);

		panelSur2 = new JPanel();
		panelSur.add(panelSur2);

		lbtext1 = new JLabel("Futuro paginado");
		panelSur1.add(lbtext1);

		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new MyListenerFrame(this));
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new MyListenerFrame(this));
		btnEliminar = new JButton("Eliminar");
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new MyListenerFrame(this));

		panelSur2.add(btnAgregar);
		panelSur2.add(btnModificar);
		panelSur2.add(btnEliminar);
		panelSur2.add(btnCerrar);

	}
	
	

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}



	public JPanel getPanelPrincipal1() {
		return panelPrincipal1;
	}



	public JTable getTable() {
		return table;
	}



	public JButton getBtnAgregar() {
		return btnAgregar;
	}



	public JButton getBtnModificar() {
		return btnModificar;
	}



	public JButton getBtnEliminar() {
		return btnEliminar;
	}



	public JButton getBtnCerrar() {
		return btnCerrar;
	}



	public JPanel getPanelNorte() {
		return panelNorte;
	}



	public JPanel getPanelSur() {
		return panelSur;
	}



	public JPanel getPanelSur1() {
		return panelSur1;
	}



	public JPanel getPanelSur2() {
		return panelSur2;
	}



	public JLabel getLbtext1() {
		return lbtext1;
	}



	public JLabel getLbtext2() {
		return lbtext2;
	}



	public void addPersona(Persona p) {
		this.lstPersona.add(p);
	}

	public List<Persona> getLstPersona() {
		return lstPersona;
	}

	public void setLstPersona(List<Persona> lstPersona) {
		this.lstPersona = lstPersona;
	}

	public void imprimirLista() {

		String[][] datos = new String[lstPersona.size()][5];

		for (int i = 0; i < lstPersona.size(); i++) {

			datos[i][0] = lstPersona.get(i).getNombre();
			datos[i][1] = lstPersona.get(i).getApellido();
			datos[i][2] = String.valueOf(lstPersona.get(i).getEdad());
			datos[i][3] = lstPersona.get(i).getDireccion();
			datos[i][4] = String.valueOf(lstPersona.get(i).isEstado());

		}

		cabecera =new String[] { "Nombre", "Apellido", "Edad", "Direccion", "Estado" };
		
		table.setModel(new javax.swing.table.DefaultTableModel(datos,cabecera));
		
//		cabecera.setFont(cabecera.getFont().deriveFont(Font.BOLD));
		
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.RIGHT);
		table.getColumnModel().getColumn(2).setCellRenderer(tcr);

	}

}
